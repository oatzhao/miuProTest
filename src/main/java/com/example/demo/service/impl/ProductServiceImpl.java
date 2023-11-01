package com.example.demo.service.impl;

import com.example.demo.dto.FullProductDto;
import com.example.demo.dto.SimpleProductDto;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;



//    public ProductServiceImpl(ProductRepo productRepo) {
//        this.productRepo = productRepo;
//    }
//

    @Override
    public void save(Product product) {
        if (product.getName().length()<5){
            throw new RuntimeException("Name must be at least 5 characters");
        }
        if (product.getPrice()<0){
            throw new RuntimeException("Price must be greater than 0");
        }

        productRepo.save(product);
    }

    @Override
    public List<FullProductDto> findAll() {
        List<Product> productList = productRepo.findAll();
        var result = new ArrayList<FullProductDto>();

        productList.forEach(product -> {
            var fullProductDto = modelMapper.map(product, FullProductDto.class);
            result.add(fullProductDto);
        });

        return result;
    }

    @Override
    public List<SimpleProductDto> findAllSimple() {
       List<Product> productList = productRepo.findAll();
       var result = new ArrayList<SimpleProductDto>();

       productList.forEach(product -> {
           var simpleProductDto = modelMapper.map(product, SimpleProductDto.class);
           result.add(simpleProductDto);
       });

       return result;


    }


}

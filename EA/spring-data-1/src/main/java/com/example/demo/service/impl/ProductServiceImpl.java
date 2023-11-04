package com.example.demo.service.impl;

import com.example.demo.aspect.ExcutionTime;
import com.example.demo.dto.FullProductDto;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;

    @ExcutionTime
    @Override
    public void create(Product product) {
        if (product.getName().length()<5){
            throw new RuntimeException("Name must be at least 5 characters");
        }
        if (product.getPrice()<0){
            throw new RuntimeException("Price must be greater than 0");
        }

        productRepo.save(product);
    }

    @ExcutionTime
    @Override
    public List<FullProductDto> findAll() {
        List<Product> productList = productRepo.findAll();
        var result= new ArrayList<FullProductDto>();

        productList.forEach(product -> {
            var fullProductDto=modelMapper.map(product, FullProductDto.class);
            result.add(fullProductDto);
        });
        return result;
    }

    @ExcutionTime
    @Override
    public FullProductDto findById(int id){
        var product=productRepo.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
        product.setName("abc");
        var result = modelMapper.map(product, FullProductDto.class);
        return result;
    }

    @ExcutionTime
    public void update(Product product){
        productRepo.save(product);
    }

    @ExcutionTime
    @Override
    public void delete(int id){
        productRepo.deleteById(id);
    }

    @ExcutionTime
    @Override
    public List<FullProductDto> findAllByPriceGreaterThan(int minPrice){
        List<Product> productList = productRepo.findAll();
        var result= new ArrayList<FullProductDto>();

        productList.forEach(product -> {
            var fullProductDto=modelMapper.map(product, FullProductDto.class);
            if(fullProductDto.getPrice()>minPrice){
                result.add(fullProductDto);
            }
        });
        return result;
    }

    @ExcutionTime
    @Override
    public List<FullProductDto> findAllByNameContains(String keyword){
        List<Product> productList = productRepo.findAll();
        var result= new ArrayList<FullProductDto>();

        productList.forEach(product -> {
            var fullProductDto=modelMapper.map(product, FullProductDto.class);
            if(fullProductDto.getName().equals(keyword)){
                result.add(fullProductDto);
            }
        });
        return result;
    }
}

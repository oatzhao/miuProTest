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

    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    public void update(Product product){
        productRepo.save(product);
    }

    @Override
    public Product getProductById(Long  id){
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public void delete(Product product){
        productRepo.delete(product);
    }

    @Override
    public List<Product> findAllByPriceGreaterThan(int minPrice){
        return productRepo.findAllByPriceGreaterThan(minPrice);
    }

    @Override
    public List<Product> findAllByNameContains(String keyword){
        return productRepo.findAllByNameContains(keyword);
    }

    @Override
    public FullProductDto findById(Long id){
        var product=productRepo.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
        product.setName("abc");
        var result = modelMapper.map(product, FullProductDto.class);
        return result;
    }
}

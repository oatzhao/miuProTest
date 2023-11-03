package com.example.demo.service;

import com.example.demo.dto.FullProductDto;
import com.example.demo.dto.SimpleProductDto;
import com.example.demo.entity.Product;

import java.util.List;

public interface ProductService {

    void create(Product product);

    List<Product> findAll();



    Product getProductById(Long id);

    void delete(Product product);

    void update(Product product);

    List<Product> findAllByPriceGreaterThan(int minPrice);

    List<Product> findAllByNameContains(String keyword);

    FullProductDto findById(Long id);
}

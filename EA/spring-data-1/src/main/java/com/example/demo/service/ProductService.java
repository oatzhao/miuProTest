package com.example.demo.service;

import com.example.demo.dto.FullProductDto;
import com.example.demo.dto.SimpleProductDto;
import com.example.demo.entity.Product;

import java.util.List;

public interface ProductService {

    void create(Product product);

    List<FullProductDto> findAll();

    FullProductDto findById(int id);

    void delete(int id);

    void update(Product product);

    List<FullProductDto> findAllByPriceGreaterThan(int minPrice);

    List<FullProductDto> findAllByNameContains(String keyword);


}

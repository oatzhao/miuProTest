package com.example.demo.service;

import com.example.demo.dto.FullProductDto;
import com.example.demo.dto.SimpleProductDto;
import com.example.demo.entity.Product;

import java.util.List;

public interface ProductService {

    void save(Product product);

    List<FullProductDto> findAll();

    List<SimpleProductDto> findAllSimple();

}

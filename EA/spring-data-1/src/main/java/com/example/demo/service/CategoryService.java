package com.example.demo.service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Category;

import java.util.List;

public interface CategoryService {
    void create(Category category);

    List<Category> findAll();



    Category getCategoryById(Long id);

    void delete(Category category);

    void update(Category category);

    Category findByName(String name);
}

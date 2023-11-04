package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public void create(@RequestBody Category category) {
        categoryService.create(category);
    }

    @GetMapping
    public List<Category> getAll() {
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }

    @PutMapping
    public void update(@RequestBody Category category) {
        categoryService.update(category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        Category category = categoryService.getCategoryById(id);
        categoryService.delete(category);
    }
}

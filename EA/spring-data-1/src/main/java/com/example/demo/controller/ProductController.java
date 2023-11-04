package com.example.demo.controller;

import com.example.demo.dto.FullProductDto;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private final ProductService productService;

    @GetMapping
    public List<FullProductDto> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public FullProductDto findById(@PathVariable int id){
        return productService.findById(id);
    }

    @PostMapping
    public void creat(@RequestBody Product product){
        productService.create(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        productService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Product product){
        productService.update(product);
    }


}

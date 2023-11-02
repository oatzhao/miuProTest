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
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PostMapping
    public void creat(@RequestBody Product product){
        productService.create(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        Product product = productService.getProductById(id);
        productService.delete(product);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Product product){
        productService.update(product);
    }


}

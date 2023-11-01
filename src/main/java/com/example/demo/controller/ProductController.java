package com.example.demo.controller;

import com.example.demo.dto.FullProductDto;
import com.example.demo.service.ProductService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    // http://localhost:8080/products
    @GetMapping
    public List<FullProductDto> findAll(){
        return productService.findAll();
    }
    // http://localhost:8080/products?color=red
    @GetMapping("/searchByColor")
    public List<FullProductDto> findAllByColor(@RequestParam String color){
        return null;
    }

    @GetMapping("/{id}")
    public FullProductDto findById(@PathVariable int id){
        return null;
    }

    @PostMapping
    public void save(@RequestBody FullProductDto productDto){

    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){

    }

    @PutMapping("/{id}")
    public void update(@RequestBody FullProductDto productDto, @PathVariable int id){

    }


}

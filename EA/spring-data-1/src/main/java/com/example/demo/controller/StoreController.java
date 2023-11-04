package com.example.demo.controller;

import com.example.demo.dto.FullProductDto;
import com.example.demo.dto.ReviewDto;
import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.entity.Review;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductService reviewService;

    @GetMapping("/findAllByPriceGreaterThan")
    public List<FullProductDto> findAllByPriceGreaterThan(@RequestParam int minPrice) {
        return productService.findAllByPriceGreaterThan(minPrice);
    }

    @GetMapping("/findAllProductsInCatCategoryAndLessThanMaxPrice")
    public List<FullProductDto> findAllByNameContains(@RequestParam String cat, @RequestParam int maxPrice) {
        return null;
    }

    @GetMapping("/findAllByNameContains")
    public List<FullProductDto> findAllByNameContains(@RequestParam String keyword) {
        return productService.findAllByNameContains(keyword);
    }

    @GetMapping("/findAllReviewsByProductId")
    public List<ReviewDto> findAllByNameContains(@RequestParam int id) {
         return  null;
    }
}

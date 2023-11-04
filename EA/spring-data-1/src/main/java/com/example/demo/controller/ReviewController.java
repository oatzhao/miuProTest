package com.example.demo.controller;

import com.example.demo.dto.ReviewDto;
import com.example.demo.entity.Review;
import com.example.demo.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public void create(@RequestBody Review review) {
        reviewService.create(review);
    }

    @GetMapping
    public List<ReviewDto > getAll() {
        return reviewService.findAll();
    }

    @GetMapping("/{id}")
    public ReviewDto getReviewById(@PathVariable int id) {
        return reviewService.getReviewById(id);
    }

    @PutMapping
    public void update(@RequestBody Review review) {
        reviewService.update(review);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        reviewService.delete(id);
    }
}

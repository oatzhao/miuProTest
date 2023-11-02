package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Review;

import java.util.List;

public interface ReviewService {
    void create(Review review);

    List<Review> findAll();



    Review getReviewById(Long id);

    void delete(Review review);

    void update(Review review);
}

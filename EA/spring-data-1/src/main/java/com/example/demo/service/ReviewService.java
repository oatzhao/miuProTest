package com.example.demo.service;

import com.example.demo.dto.ReviewDto;
import com.example.demo.entity.Category;
import com.example.demo.entity.Review;

import java.util.List;

public interface ReviewService {
    void create(Review review);

    List<ReviewDto> findAll();



    ReviewDto getReviewById(int id);

    void delete(int id);

    void update(Review review);
}

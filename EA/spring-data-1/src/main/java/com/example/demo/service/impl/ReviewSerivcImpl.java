package com.example.demo.service.impl;

import com.example.demo.dto.ReviewDto;
import com.example.demo.entity.Review;
import com.example.demo.repository.ReviewRepo;
import com.example.demo.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ReviewSerivcImpl implements ReviewService {

    private final ReviewRepo reviewRepo;
    private final ModelMapper modelMapper;
    @Override
    public void create(Review review) {
        reviewRepo.save(review);
    }

    @Override
    public List<ReviewDto> findAll() {
        List<Review> reviewList = reviewRepo.findAll();
        var result= new ArrayList<ReviewDto>();

        reviewList.forEach(r -> {
            var reviewDto=modelMapper.map(r, ReviewDto .class);
            result.add(reviewDto);
        });
        return result;
    }

    @Override
    public ReviewDto getReviewById(int id) {
        var review=reviewRepo.findById(id).orElseThrow(()->new RuntimeException("Review not found"));
        var result = modelMapper.map(review, ReviewDto.class);
        return result;
    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }
    @Override
    public void update(Review review) {
        reviewRepo.save(review);
    }
}

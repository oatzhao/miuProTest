package com.example.demo.repository;

import com.example.demo.dto.ReviewDto;
import com.example.demo.entity.Product;
import com.example.demo.entity.Review;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface ReviewRepo extends ListCrudRepository<Review, Integer> {
    @Override
//    @EntityGraph(value = "productWithReviews", type = EntityGraph.EntityGraphType.LOAD)
    Optional<Review> findById(Integer id);

    @Override
    List<Review> findAll();

    @Override
    void deleteById(Integer integer);

    @Override
    <S extends Review> S save(S entity);
}

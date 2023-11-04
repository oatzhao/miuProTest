package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface AddressRepo extends ListCrudRepository<Product, Integer> {
}

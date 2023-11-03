package com.example.demo.repository;

import com.example.demo.entity.Address;
import com.example.demo.service.AddressService;
import org.springframework.data.repository.ListCrudRepository;

public interface AddressRepo extends ListCrudRepository<Address, Long> {
}

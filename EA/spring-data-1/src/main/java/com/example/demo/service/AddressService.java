package com.example.demo.service;


import com.example.demo.entity.Address;
import com.example.demo.entity.Product;

import java.util.List;

public interface AddressService {
    void create(Address address);

    List<Address> findAll();



    Address getAdressById(Long id);

    void delete(Address address);

    void update(Address address);
}

package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.Review;
import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    void create(User user);

    List<User> findAll();



    User getUserById(Long id);

    void delete(User user);

    void update(User user);

    UserDto addUser(UserDto userDto) throws Exception;
}

package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.model.auth.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;
    @Override
    public void create(User user) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    @Transactional
    public UserDto addUser(UserDto userDto) throws Exception {
        //  userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        Optional<User> byEmail = userRepository.findByEmail(userDto.getEmail());
        if(byEmail.isPresent())
            throw new Exception("Email already exists");
        for (Role role : userDto.getRoles()) {
            roleRepository.save(role);
        }
        User savedUser = userRepository.save(modelMapper.map(userDto, User.class));
        return modelMapper.map(savedUser,UserDto.class);
    }
}

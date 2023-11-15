package com.example.demo.dto;

import com.example.demo.model.auth.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto {
    private Integer id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    private List<Role> roles;
}

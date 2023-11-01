package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Product {

    private int id;
    private String name;
    private int price;
    private String category;
    private String color;

}

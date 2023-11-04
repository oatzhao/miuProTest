package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Category {
    @Id
    private int categoryid;
    private String name;

//    @JoinColumn(name="category_id")
//    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
//    private List<Product> products;
}

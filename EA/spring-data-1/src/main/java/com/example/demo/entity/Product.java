package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Product {
    @Id
    private int productid;
    private String name;

    private int price;
    private String category;
    private String color;

//    @Fetch(FetchMode.SELECT)
//    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
//    @JoinColumn(name="product_id")
//    private List<Review> reviews;

    @OneToMany(mappedBy = "product")
    private List<Order> orders;
}

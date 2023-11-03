package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="orders")
public class Order {
    @EmbeddedId
    private OrderID orderID;

    private int quntity;

    @MapsId("userId")
    @ManyToOne
    private User user;

    @MapsId("productId")
    @ManyToOne
    private Product product;
}

package com.example.demo.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.PrimitiveIterator;

@Embeddable
public class CourseID implements Serializable {

    private int id;
    private String coureName;
}

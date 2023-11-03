package com.example.demo.entity;

import jakarta.persistence.EmbeddedId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.PrimitiveIterator;

@Getter
@Setter
public class CourseID implements Serializable {
    private Long id;
    private String coureName;
}

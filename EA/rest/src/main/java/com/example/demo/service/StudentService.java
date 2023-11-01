package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.FullStudentDto;
import com.example.demo.dto.SimpleStudentDto;
import com.example.demo.entity.Student;
public interface StudentService {
    void save(Student student);

    List<FullStudentDto> findAll();

    List<SimpleStudentDto> findAllSimple();
}

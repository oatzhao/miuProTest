package com.example.demo.service.impl;

import com.example.demo.dto.FullStudentDto;
import com.example.demo.dto.SimpleStudentDto;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepo studentRepo;
    private final ModelMapper modelMapper;

    @Override
    public void save(Student student) {
        if(student.getFirstName().length()<2){
            throw new RuntimeException("Name must be at least 5 characters");
        }

        if(student.getGpa()<0){
            throw new RuntimeException("GPA must be greater than 0");
        }
    }

    @Override
    public List<FullStudentDto> findAll() {
        List<Student> studentList = studentRepo.findAll();
        var result = new ArrayList<FullStudentDto>();

        studentList.forEach(student -> {
            var fullStudentDto = modelMapper.map(student, FullStudentDto.class);
            result.add(fullStudentDto);
        });

        return result;
    }

    @Override
    public List<SimpleStudentDto> findAllSimple() {
        List<Student> studentList = studentRepo.findAll();
        var result = new ArrayList<SimpleStudentDto>();

        studentList.forEach(student -> {
            var simpleStudent = modelMapper.map(student, SimpleStudentDto.class);
            result.add(simpleStudent);
        });
        return result;
    }
}

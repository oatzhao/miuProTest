package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private static List<Student> students =new ArrayList<>();

    public void save(Student student){
        students.add(student);
    }

    public List<Student> findAll(){
        return students;
    }
}

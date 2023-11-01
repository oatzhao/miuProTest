package com.example.demo.controller;

import com.example.demo.dto.FullStudentDto;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<FullStudentDto> findAll(){
        return studentService.findAll();
    }
    // http://localhost:8080/products?course=EA
    @GetMapping("/searchByCourse")
    public List<FullStudentDto> findAllByCourse(@RequestParam String course){
        return null;
    }

    @GetMapping("/{id}")
    public FullStudentDto findById(@PathVariable int id){
        return null;
    }

    @PostMapping
    public void save(@RequestBody FullStudentDto studentDto){
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
    }

    @PutMapping("/{id}")
    public void update(@RequestBody FullStudentDto studentDto, @PathVariable int id){
    }
}

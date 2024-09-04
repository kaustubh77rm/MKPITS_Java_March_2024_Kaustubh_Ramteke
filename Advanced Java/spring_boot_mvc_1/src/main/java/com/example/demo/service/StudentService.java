package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> findAll();
    Student save(Student student);

    Student findById(int id);

    void deleteById(int id);

    int update(Student student);
}
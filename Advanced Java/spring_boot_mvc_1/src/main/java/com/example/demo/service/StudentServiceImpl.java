package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findById(int id) {
        Optional<Student> result = studentRepository.findById(id);
        return result.orElse(null); // Return the student if present, otherwise return null
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public int update(Student student) {
        if (studentRepository.existsById(student.getId())) {
            studentRepository.save(student);
        } else {
            throw new IllegalArgumentException("Student not found with ID: " + student.getId());
        }
        return student.getId();
    }
}
package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
@RequestMapping("/students")
public class StudentController {

   private StudentService studentservice;
   @Autowired
   public StudentController(StudentService studentservice) {
       this.studentservice=studentservice;
   }

    @GetMapping("/add")
    public String showAddStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student) {

       if (student == null || student.getFirstname() == null || student.getStudentDetails() == null) {
            throw new IllegalArgumentException("Invalid student data");
        }

       studentservice.save(student);

       return "redirect:/students/view/" + student.getId();
    }

    @GetMapping("/list")
    public String listStudents(Model model) {
        List<Student> students = studentservice.findAll();
        model.addAttribute("students", students);
        return "student-list";
    }

    @GetMapping("/view/{id}")
    public String viewStudent(@PathVariable int id, Model model) {
        Student student = studentservice.findById(id);
        model.addAttribute("student", student);
        return "view-student";
    }
    @GetMapping("/edit/{id}")
    public String showEditStudentForm(@PathVariable int id, Model model) {
        Student student = studentservice.findById(id);
        model.addAttribute("student", student);
        return "edit-student";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute("student") Student student) {
        studentservice.update(student);
        return "redirect:/students/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentservice.deleteById(id);
        return "redirect:/students/list";
    }
}
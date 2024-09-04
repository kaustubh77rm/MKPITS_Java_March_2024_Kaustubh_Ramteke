package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringBootMvc1Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvc1Application.class, args);
	}
}
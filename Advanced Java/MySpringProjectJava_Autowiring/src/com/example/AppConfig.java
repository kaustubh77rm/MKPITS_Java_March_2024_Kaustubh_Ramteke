package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Employee e1() {
        Employee employee = new Employee();
        employee.setName("Vivek");
        employee.setSalary(40000);
        return employee;
    }

    @Bean
    public Employee e2() {
        Employee employee = new Employee();
        employee.setName("Akash");
        employee.setSalary(50000);
        return employee;
    }
}

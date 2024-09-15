package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = (Employee) context.getBean("e1");
		emp.display();
		
		emp = (Employee) context.getBean("e2");
		emp.display();
	}	
}
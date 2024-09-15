package com.example;

public class Student {
	
	private String name;
	private String city;
	
	public Student() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void display() {
		System.out.println("name="+name);
		System.out.println("city="+city+"\n");
	}		
}
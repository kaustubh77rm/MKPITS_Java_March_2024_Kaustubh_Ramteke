package spring1;

import java.util.List;
import java.util.Map;

public class Student {
	private String name;
	private int marks;
	private Address address;
	private List<String>list;
	private Map<String,String>map;
	
	Student(String name){
		this.name=name;
	}
	
	Student(String name, int marks, Address address){
		this.name=name;
		this.marks=marks;
		this.address=address;
	}
	
	Student(List <String>list){
		this.list=list;
	}
	
	Student(Map<String,String> map){
		this.map=map;
	}
	
	Student(String name, int marks, Address address, List<String> list, Map<String, String> map) {
		super();
		this.name = name;
		this.marks = marks;
		this.address = address;
		this.list = list;
		this.map = map;
	}

	public void display() {
		System.out.println(name);
		System.out.println(marks);
		System.out.println(address);
		System.out.println(list);
		System.out.println(map);
		System.out.println();
	}
}
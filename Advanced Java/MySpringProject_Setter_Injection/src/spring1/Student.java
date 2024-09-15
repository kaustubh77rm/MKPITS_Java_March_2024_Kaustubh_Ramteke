package spring1;

import java.util.List;
import java.util.Map;

public class Student {
	private String name;
	private int age;
	private Address address;
	private List<String>list;
	private Map<String,String>map;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(list);
		System.out.println(map);
		System.out.println();
	}
}
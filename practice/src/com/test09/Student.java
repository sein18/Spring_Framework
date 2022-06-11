package com.test09;

 
 
public class Student {

	private String name;
	private String age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	 
}

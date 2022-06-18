package com.codingassignment2.usingobjectreturn;

public class Employee {
	String name;
	String designation;
	int age;
	public Employee(String name, String designation, int age) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

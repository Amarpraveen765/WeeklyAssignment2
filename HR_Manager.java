package com.codingassignment2.usingobjectreturn;

public class HR_Manager {
	String n;
	String d;
	int g;
	public Employee display(Employee a) {
		n=a.getName();
		d=a.getDesignation();
		g=a.getAge();
		return a;
	}
	void process_Records() {
		System.out.println("name: "+n);
		System.out.println("age: "+g);
		System.out.println("designation: "+d);
		System.out.println(" ");
	}


}

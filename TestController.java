package com.codingassignment2.usingobjectreturn;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//employee 1
		Employee o = new Employee("Amar","Software Engineer",21);
		HR_Manager o2 =new HR_Manager();
		o = o2.display(o);
		o2.process_Records();
		//employee 2
		Employee b = new Employee("saketh","Data Engineer",23);
		b = o2.display(b);
		o2.process_Records();
		//employee 3
		Employee c = new Employee("Zen","Full Stack Developer",25);
		c = o2.display(c);
		o2.process_Records();
		//employee 4
		Employee d = new Employee("krish","software analyst",24);
		d = o2.display(d);
		o2.process_Records();
		//employee 5
		Employee e = new Employee("Aman","UI Developer",22);
		e = o2.display(e);
		o2.process_Records();
		

	}

}

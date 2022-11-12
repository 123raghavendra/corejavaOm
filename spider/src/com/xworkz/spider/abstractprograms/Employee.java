package com.xworkz.spider.abstractprograms;

public class Employee extends Person {

	@Override
	void work() {
		System.out.println(" employee is working");
	}
	
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.work();
		
		
	}

}

package com.xworkz.spider.interfacedemo;

public class Employee implements Person {

	@Override
	public void eat() {
		System.out.println("Eating birayani ");
	}

	public static void main(String[] args) {
		System.out.println(Person.name);// because static variable

		System.out.println("==============================");
		
		Employee employee = new Employee();
		employee.eat();
		
		System.out.println("==============================");
		String name2 = employee.name;
		System.out.println(name2);

	}
}

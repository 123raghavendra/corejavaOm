package com.xworkz.spider.abstraction;

public class Employee extends Person {

	@Override
	void work() {
		System.out.println(" working peoples");
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		int amount = employee.amount();
		System.out.println(amount);
		employee.work();

		System.out.println("=============");

		Person emp = new Employee();
		int amount2 = emp.amount();
		System.out.println(amount2);
		emp.work();
	}

}

package com.xworkz.spider.constructor;

// here i ctreated display method to reduce code and i created display method for 
//direct calling without ue id,name,salary 
//compare the code between the employee and employee 1
public class Employee1 {

	int id;
	String name;
	double salary;

	Employee1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("employee id:" + this.id);// or id 
		System.out.println("employee name:" + this.name);// or  name
		System.out.println("employee salary:" + this.salary);// or salary 

	}

	public static void main(String[] args) {

		Employee1 emp1 = new Employee1(100, "ramu", 1800.00);
		Employee1 emp2 = new Employee1(200, "ranga", 180.00);

		emp1.display();
		emp2.display();
	}

}

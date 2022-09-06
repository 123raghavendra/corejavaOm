package com.xworkz.corejava.Inheritance;

public class SingleInheritance {
	
	public String name;
	public int age;
	public SingleInheritance() {
		// TODO Auto-generated constructor stub
	}

	public SingleInheritance(String name,int age) {
		this.name=name;
		this.age=age;
	
	}
	
	public void torisu() {
		System.out.println("hi i am torisu method");
	}

	@Override
	public String toString() {
		return "SingleInheritance [name=" + name + ", age=" + age + "]";
	}
}

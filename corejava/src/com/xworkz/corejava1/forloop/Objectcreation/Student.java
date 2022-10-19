package com.xworkz.corejava1.forloop.Objectcreation;

public class Student {

	//here diclearing and initilization of non static variables to call no static variables 
	//to create object
	int id =10;
	String name="raghu";
	
	public static void main(String[] args) {
		Student student=new Student();
		System.out.println(student.id);
		System.out.println(student.name);
		
		System.out.println("=============");
		//re Initilization 
student.id=20;
student.name="abhi";

System.out.println(student.id);
System.out.println(student.name);
		
	}
}

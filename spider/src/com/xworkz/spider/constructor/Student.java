package com.xworkz.spider.constructor;

public class Student {

	int age;
	
	Student(int a){
		age=a;
	}

	public static void main(String[] args) {

		Student student=new Student(21);
		Student student1=new Student(22);
		Student student3=new Student(23);

		Student student4=new Student(24);

		System.out.println("age:"+student.age+"  " +"age:"+student1.age+"   "+"age:"+student3.age+"   "+"age:"+student4.age);
	}

}

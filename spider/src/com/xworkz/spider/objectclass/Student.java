package com.xworkz.spider.objectclass;

// storing an object into array 
// to override the tostring method for avoid fullyQualifiedname 
public class Student {

	int age;
	String name;
	
	public Student(int age,String name) {
	this.age=age;
	this.name=name;
	}
	
	public String toString() {
		return "name:"+name+" "+ "age:"+age;	
	}
	
	public static void main(String[] args) {
		 Student student = new Student(20,"malu");
		 Student student1 = new Student(21,"abhi");
		 Student student2 = new Student(23,"sangamesh");
		 Student student3 = new Student(24,"manoj");
		 Student student4= new Student(25,"santosh");
		 
		 Student[] stu=new Student[5];
		 stu[0]=student;
		 stu[1]=student1;
		 stu[2]=student2;
		 stu[3]=student3;
		 stu[4]=student4;
		 
		 for(int i=0;i<stu.length;i++) {
			 System.out.println(stu[i]);
		 }

		 

		 
		
	}
	
}

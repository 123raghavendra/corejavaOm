package com.xworkz.spider.constructor;


//here i created multiple object and called by using object referance and also every time
//i am using name,id salary
//but the differce between employee and employeee1 is i create ddisply method in employee1 class  for to avoid 
// every time for calling name id salary

public class Employeee {
	
	int id;
	String name;
	double salary;
	
	
	public Employeee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {

		Employeee e1=new Employeee(100, "Ramu", 1000.00);
		Employeee e2=new Employeee(101, "Ravan", 100.00);
		
		System.out.println("Details of employeee");
    System.out.println("==================");
		 
		System.out.println("id="+e1.id);
		System.out.println("name="+e1.name);
		System.out.println("salary="+e1.salary);
		
		System.out.println("------------------");
		
		System.out.println("id="+e2.id);
		System.out.println("name="+e2.name);
		System.out.println("salary="+e2.salary);
		
	}

}

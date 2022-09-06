package com.xworkz.corejava.constructor;

public class ConstructorOverloading {
	
	int id;
	String name;
	int age;
	String date;
	
	ConstructorOverloading(int id,String name){
		
		this.id=id;
		this.name=name;
		
	}
	
	ConstructorOverloading(int id,String name,int age){
	
		this.id=id;
		this.name=name;
		this.age=age;
	}
	ConstructorOverloading(int id,String name,int age,String date){
		this.id=id;
		this.name=name;
		this.age=age;
		this.date=date;
	}
	void display() {
		System.out.println(id+" "+name+" "+age+" "+date);
	}
	public static void main(String[] args) {
		ConstructorOverloading	c1=new ConstructorOverloading(10,"raghu");
		ConstructorOverloading	c2=new ConstructorOverloading(11,"abhi",29);
		ConstructorOverloading	c3=new ConstructorOverloading(13,"nandan",30,"30/20/11");
		c1.display();
		c2.display();
	c3.display();
	}
	
}

package com.xworkz.corejava.constructor;

public class DefaultEx2type {

	int id;
	String name;
	Double price;
	
	
	void display() {
		
		System.out.println(id+" "+name+" "+price);
	}
	
	public static void main(String[] args) {
		DefaultEx2type raghu=new DefaultEx2type();
		DefaultEx2type malu=new DefaultEx2type();
		DefaultEx2type abhi=new DefaultEx2type();

	raghu.display();
	malu.display();
	abhi.display();
	
	
	
	}
}

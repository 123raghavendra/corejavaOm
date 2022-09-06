package com.xworkz.corejava.constructor;

public class DefaultConstructorEx2 {

	String name;
	int age;
	
	void display() {
		
		System.out.println(name+ " "+age);
		
	}
	
	public static void main(String[] args) {
		DefaultConstructorEx2 de=new DefaultConstructorEx2();
			de.display();
		}
		
	}
	


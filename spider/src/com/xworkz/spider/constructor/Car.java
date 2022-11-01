package com.xworkz.spider.constructor;

public class Car {

	// after object creation constructor will executed
	
	
	// this is non parameterized custom constructor or Default constructor
	Car(){
		System.out.println("Hello");
		
	}
	public static void main(String[] args) {
		
		System.out.println("Start");

		Car car=new Car();
		
		System.out.println("End");
	}

}

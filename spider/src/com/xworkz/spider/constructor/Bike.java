package com.xworkz.spider.constructor;

public class Bike {
	
	//Parameterized custom constructor or parameter constructor
	
	Bike(String name){
		System.out.println( "name:"+name);
	}

	public static void main(String[] args) {
		
		Bike bike=new Bike("Raghavendra");
	}
}

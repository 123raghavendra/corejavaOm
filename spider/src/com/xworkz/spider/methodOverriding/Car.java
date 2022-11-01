package com.xworkz.spider.methodOverriding;

public class Car extends Vechile {

	@Override
	public void start() {
		super.start();
		System.out.println("Car is started");
		
	}
	
	 public void stop() {
		 System.out.println("Car stopped");
	 }
	 
	 public static void main(String[] args) {
		Car car=new Car();		 
	car.start();
	car.stop();
	 }
}



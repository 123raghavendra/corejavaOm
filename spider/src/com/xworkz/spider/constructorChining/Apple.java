package com.xworkz.spider.constructorChining;


//Constructer Channing example , 1st we calling apple constructer inside this by using this statement 
// we initilize the value 10 by calling method.
public class Apple {

	public Apple() {
		this(10);
		System.out.println(1);
	}

	Apple(int a) {
		this(20, "raghu");
		System.out.println(2);
	}

	Apple(int a, String name) {
		System.out.println(3);
	}

	public static void main(String[] args) {
		Apple apple = new Apple();
	}
}

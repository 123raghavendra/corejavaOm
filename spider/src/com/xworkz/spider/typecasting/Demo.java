package com.xworkz.spider.typecasting;

public class Demo {

	public static void main(String[] args) {
// type casting means converting one type of data to another type of data 
		//there are two types - primitive and non primitive
		// primitive type has a two types 1) widenning 2) narrowing
		System.out.println("widenning example");
	// widenning means- small data type to  convert big data type - implicitly 
//byte - short - int - long - float - double		
		int a=10;
		double b=a;
		System.out.println(b);
		
		char c='A';
		float  d=c;
		System.out.println(d);
		
		System.out.println("Narrowing example");
// Narrowing means - converting big data type to smalldata type
// double - float - long- int - short - byte		
		double x=10.0;
		int y= (int) x;
		System.out.println(y);
		
		int m=66;
		char n=(char) m;
		System.out.println(n);
	}

}

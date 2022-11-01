package com.xworkz.statickeyword;

public class StaticKeyword {
	
static int age =20;
	
	static void search() {
		System.out.println("searching something");
	}

	public static void main(String[] args) {
	/*Accessing the static properties out side the same class */
// use this type of calling 
		System.out.println(StaticKeyword.age);
		 StaticKeyword.search();
		
		 System.out.println("============");
		
	/*Accessing the static properties within the same class */
		 // use the type of calling within the class 
		 System.out.println(age);
		 search();
		 
	}
}

package com.xworkz.spider.typecasting.nonprimitive;

public class runner {

	public static void main(String[] args) {
		
	// up casting 	
	Father father=new	Son();
	System.out.println(father.age);
	
	
	
System.out.println("================");
      //down casting 
	Son son=(Son)father;
	System.out.println("name : "+son.nameOfFather);
	System.out.println("age: "+son.age);

	}
}

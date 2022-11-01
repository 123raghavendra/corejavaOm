package com.xworkz.spider.method;


// method without argument with return statement 
public class Method3 {
	
	int  display(){
		return 10;
		
	}

	public static void main(String[] args) {
		
		Method3 method3=new  Method3();
		 System.out.println(method3.display());
		 
		 // or another way to call the method 
		 
		 int result  = method3.display();
		 System.out.println(result);
	}
}

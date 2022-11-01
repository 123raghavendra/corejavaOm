package com.xworkz.spider.method;

public class Example2 {
	
	// requirement - To create A method which will add 2 numbers

	
	//method with parameter without returning statement 
	void add (int a,int b) {
		System.out.println( "sum of a+b is ="+(a+b));
		
		// or another way to call 
		int sum=a+b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		Example2 example2=new Example2();
	 example2.add(10, 0);
	 example2.add(20, 20);
	 example2.add(10, 30);
	 
	}
}

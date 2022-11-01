package com.xworkz.spider.method;

public class Method4 {
	
	
	//method with argument and return statement
	 int multiple(int n){
		
		return n*n;
	}

	 public static void main(String[] args) {
		Method4 method4=new Method4();
		System.out.println(method4.multiple(2));
		
		System.out.println("===========");
	//	or another way to call 
			
		int result = method4.multiple(2);
	     System.out.println(result);
	 }
}

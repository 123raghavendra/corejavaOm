package com.xworkz.spider.method;

public class AllMethodTest {
	
	public static void main(String[] args) {
		
		AllMethod5 allMethod5=new AllMethod5();
	System.out.println("=======");
		allMethod5.m1();
		
	System.out.println("=========");
	allMethod5.m2("raghavendra", 29);
	
	 System.out.println("=======");
	  double result=allMethod5.m3();
	   System.out.println(result);
	//or another way to call 
	System.out.println(allMethod5.m3());
	System.out.println("=========");

	System.out.println(allMethod5.m4(3));
	//or another way to call 
	 int result1=allMethod5.m4(3);
	System.out.println(result);
	}

}

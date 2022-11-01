package com.xworkz.spider.blocks;

public class NonStatic {
//Before object creation non static block not executed
	//after the object creation non static block will be executed
	{
		System.out.println("Non Static 1");
	}
	
	{
		System.out.println("Non Static 2");
	}
	
	public static void main(String[] args) {

		System.out.println("start");
		
		NonStatic nonStatic=new NonStatic();
		
		System.out.println("end");
	}
	
	{
		System.out.println("non static block 3");
	}

}

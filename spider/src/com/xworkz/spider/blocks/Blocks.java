package com.xworkz.spider.blocks;

public class Blocks {
// Always static block will be executed 1st & 2nd non static
	
	static {
		System.out.println(" Static block 1");
		
	}
	
	static {
		System.out.println("static block 2");
	}
	
	public static void main(String[] args) 
	{
System.out.println("hello ");
	}
	
	static {
		System.out.println("static block 3");
	}
}



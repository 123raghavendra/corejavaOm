package com.xworkz.spider.blocks;

public class StaticInitilization {
// 1st name =null 
	static String name;
//by using static block initilazation of values
	static {
		System.out.println("Initilazation name is raghu -1");
		name="Raghu"; // or className.name="Raghu";
	}
	public static void main(String[] args) {

		System.out.println(name);
	}

// re innitilazation
	static {
		System.out.println("ReInitilazation name is raghu -2");
		name="Ramya";// or className.name="Ramya";
	}
}

// name=null -> 1st initilazation  Raghu-> re initilazation Ramya
package com.xworkz.spider.instanceofdemo;

public class InstanceRunner {

	public static void main(String[] args) {
father f=new father();
son s=new son();


System.out.println(f instanceof father);// true
System.out.println(s instanceof son);// true

System.out.println(f instanceof son);// false
System.out.println( s instanceof father );// true		
	}
	}
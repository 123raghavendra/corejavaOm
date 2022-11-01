package com.xworkz.spider.Array;

public class Test {

	public static void main(String[] args) {
		//array initilization directly
		int[] x = { 10, 20, 30 };

		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		System.out.println("================");
		
		//  OR by using forloop to avoid s.o.p.statement
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		
	}

}

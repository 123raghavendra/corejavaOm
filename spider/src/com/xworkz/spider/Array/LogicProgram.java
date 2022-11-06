package com.xworkz.spider.Array;

public class LogicProgram {

	public static void main(String[] args) {

		int [] data= {10,20,30,40,50};
		
		int sum=0;
		
		for(int i=0;i<data.length;i++) {
			sum=sum+data[i];
		}
		System.out.println("sum:"+sum);
		
		System.out.println("average:"+sum/data.length);
	}
 
}

package com.xworkz.spider.Array;

public class Test2 {

	public static void main(String[] args) {

		String [] a= {"raghu","madhu","abhi","chidu","nandish","manoj","darshan"};
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
			//System.out.println(a.length);
			
			
		}
		System.out.println("============");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}

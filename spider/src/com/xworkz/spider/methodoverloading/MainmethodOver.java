package com.xworkz.spider.methodoverloading;

public class MainmethodOver {

	
	public static void main(String[] args) {
		System.out.println("hello abhi");
		main(10);
		main(20.20);
		main(977771177);
	}
	
	public static void main(int x) {
		System.out.println(x);
		
	}
	
	public static void main(double y) {
		System.out.println(y);
	}
	
	
	public static void main(long z) {
		System.out.println(z);
		
	}
}

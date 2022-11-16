package com.xworkz.spider.exception;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("start");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Value of A:");

		int a = scanner.nextInt();
		System.out.println(" Enter the value of B:");

		int  b = scanner.nextInt();

	try {
			
		
		System.out.println(a/b);
		}
		catch(ArithmeticException exception) {
			System.out.println("cant devided by zero if we devide by zero get ArithmeticException");
		}
		System.out.println("end");
		scanner.close();
	}

}

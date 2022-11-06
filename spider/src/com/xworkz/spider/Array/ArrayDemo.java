package com.xworkz.spider.Array;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the number of elements to be inserted");
int nextInt = scanner.nextInt();
int [] a= new  int [nextInt];
System.out.println("enter "+nextInt+" elements");
for(int i=0; i<a.length;i++) {
	a[i]=scanner.nextInt();

}
System.out.println("Array elements are");
for(int i=0; i<a.length;i++) {
	System.out.println(a[i]);
}
	}

}

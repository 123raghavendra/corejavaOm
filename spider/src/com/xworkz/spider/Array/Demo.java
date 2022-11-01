package com.xworkz.spider.Array;

public class Demo {

	public static void main(String[] args) {

		/* Array declaration */

		int[] a;

		/* Array Creation */
		a = new int[3];

		/* printing array elements */

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		System.out.println("==============");
		/* Array Initilization */
		a[1] = 20;
		a[2] = 30;

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		System.out.println("===============");

		System.out.println("Array declaration and creation");
		// Array declaration and creation
		double[] raghu = new double[5];

		// before initilization
		System.out.println(raghu[0]);
		System.out.println(raghu[1]);
		System.out.println(raghu[2]);
		System.out.println(raghu[3]);
		System.out.println(raghu[4]);
		
		System.out.println("after initilization");
		raghu[0]=10.9;
		raghu[1]=50.2;
		raghu[2]=20.7;
		raghu[3]=40.4;
		raghu[4]=30.3;
		
		System.out.println(raghu[0]);
		System.out.println(raghu[1]);
		System.out.println(raghu[2]);
		System.out.println(raghu[3]);
		System.out.println(raghu[4]);
	}

}

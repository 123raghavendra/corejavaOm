package com.xworkz.variables;

public class Test {

	// malatesh practice 
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		Test test = new Test();
		test.x = 888;
		test.y = 999;

		Test test2 = new Test();
		System.out.println(test.x);
		System.out.println(test.y);
       System.out.println( test2.x);
       System.out.println(test2.y);
	}

}

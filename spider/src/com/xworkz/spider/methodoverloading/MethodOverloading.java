package com.xworkz.spider.methodoverloading;

public class MethodOverloading {

	void display() {
		System.out.println("hello");

	}

	void diplay(int x) {
		System.out.println(x);

	}

	void display(int y) {
		System.out.println(y);

	}

	void display(int x, String z) {
		System.out.println(x + " " + z);

	}

	void display(String x, int z) {
		System.out.println(x + " " + z);

	}
}

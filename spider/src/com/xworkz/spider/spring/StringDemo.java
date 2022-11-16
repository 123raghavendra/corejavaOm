package com.xworkz.spider.spring;

public class StringDemo {

	public static void main(String[] args) {

		String s = new String("A");
		System.out.println(s);// internally to string method is overridden.
		System.out.println(s.toString());

		System.out.println("======================");
		System.out.println(s.hashCode());// internally hashcode is also overridden

		System.out.println("==================");
		String string = new String("java");
		String string2 = new String("java");

		System.out.println(string.equals(string2));// internally equals method is also overidden

	}

}

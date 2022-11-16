package com.xworkz.spider.objectclass;

// how to use to string method in object class
public class Person {

	public int id;
	public String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + name;
	}

	public static void main(String[] args) {
		Person p = new Person(101, "raghu");
		System.out.println(p);// implicitly to string methid will overide -- if we dont want fully qualified
								// name to override the to string method

		System.out.println("ID of person:" + p.id + " " + "name of person:" + p.name);// implicitly to string will
																						// override

		System.out.println(p.toString());// expectly calling the to string method

	}
}

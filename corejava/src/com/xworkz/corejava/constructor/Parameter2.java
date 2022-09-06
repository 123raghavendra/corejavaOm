package com.xworkz.corejava.constructor;

public class Parameter2 {

	String name;
	int age;

	Parameter2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
void display() {
System.out.println(name+" "+age);	
}
public static void main(String[] args) {
	Parameter2 pc=new Parameter2("hello",87);
pc.display();
	
}
}




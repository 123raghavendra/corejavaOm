package com.xworkz.corejava.variables;

public class Variable2 {
	int rollNumber;
	static int age=20;
	
	void name() {
		
//we can declare varible inside the method or constructor or block is called local varible
		String name="raghavendra";
		System.out.println(name);
	}
	
	
public static void main(String[] args) {
	int var=20;
	Variable2 variable2=new Variable2();
System.out.println(variable2.rollNumber);
	
    //System.out.println(age); or 
	System.out.println(Variable2.age);
	System.out.println(var);
	Variable2 variable=new Variable2();
	variable.name();
	
}
	
}

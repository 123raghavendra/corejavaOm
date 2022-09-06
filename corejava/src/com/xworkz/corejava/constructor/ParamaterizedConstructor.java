package com.xworkz.corejava.constructor;

public class ParamaterizedConstructor {
	
	int id;
	String name;
	Double price;
	
	public ParamaterizedConstructor(int id,String name,Double price) {
	this.id=id;
	this.name=name;
	this.price=price;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+price);
	
	}
public static void main(String[] args) {
	ParamaterizedConstructor pc=new ParamaterizedConstructor(11,"abhi",30.00);
	ParamaterizedConstructor pc1=new ParamaterizedConstructor(12,"darshan",11.00);
	ParamaterizedConstructor pc2=new ParamaterizedConstructor(13,"manoj",10.00);

	pc.display();
	pc1.display();
	pc2.display();
}

}


package com.xworkz.corejava.Inheritance;

public class MultilevelInheritance {
	
	public String name;
	public String adress;
	
	public MultilevelInheritance() {
		System.out.println("default consytructor of multilevel");
	
	}
	
	
	public MultilevelInheritance(String name,String adress) {
		this.name=name;
		this.adress=adress;
		System.out.println("parameter passig for constructor of multilevel ");
	}

}

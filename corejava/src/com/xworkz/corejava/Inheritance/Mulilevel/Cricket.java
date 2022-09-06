package com.xworkz.corejava.Inheritance.Mulilevel;

public class Cricket {
	
	public String captian;
	public String country;
	public String gender;

	public Cricket() {
		System.out.println("Default constructor of Cricket");
	}
	
	public boolean entertainment() {
		return false;
		}
	
public double presentation() {
 
	return 150000.00;
	
	
}
public void torisu() {
	System.out.println(this.captian);
	System.out.println(this.country);
	System.out.println(this.gender);
	
}

public Cricket(String captian,String country,String gender){
		this.captian=captian;
		this.country=country;
		this.gender=gender;
		
		
	}
}



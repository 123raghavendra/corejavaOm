package com.xworkz.corejava.accessmodifiers;

public class AutoMobile {
	
public 	String type;
public 	String brand;
	
public AutoMobile() {
	System.out.println("TODO Auto-generated AutoMobile constructor stub");
}

	public  void torisu() {
		System.out.println(this.brand);
		System.out.println(this.type);
		
		
	}
	
public double sellAccessories(String name) {
	
	if(name=="breakCable") {
	
		return 150.00;
	}
	if(name=="headlight") {
		
		return 450.00;
	}
		
	return 0.00;
}
public void  setType(String type) {
	this.type=type;
}
public void setBrand(String brand) {
	this.brand=brand;
	
}
}

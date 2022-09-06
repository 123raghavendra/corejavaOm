package com.xworkz.corejava.accessmodifiers;

public class HondaAutoMobile extends AutoMobile {
public double openTime;
public double closeTime;

 public void torisu() {
	 super.torisu();
	 System.out.println(this.openTime);
	 System.out.println(this.closeTime);
 }
public HondaAutoMobile(double openTime,double closeTime) {
	this.closeTime=closeTime;
	this.openTime=openTime;
}

}

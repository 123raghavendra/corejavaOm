package com.xworkz.corejava.accessmodifiers.example;

import com.xworkz.corejava.accessmodifiers.AutoMobile;
import com.xworkz.corejava.accessmodifiers.HondaAutoMobile;
import com.xworkz.corejava.accessmodifiers.TataAutoMobile;

public class Test {
	public static void main(String[] args) {
		AutoMobile autoMobile=new AutoMobile();
			double xyz=autoMobile.sellAccessories("headlight")	;
	           System.out.println(xyz);
			System.out.println(autoMobile.sellAccessories("autoVechile"));
	    autoMobile.setBrand("Hero");
	    autoMobile.setType("two wheeler");
	    autoMobile.torisu();
	System.out.println("=============================");
	
	HondaAutoMobile hondaAutoMobile=new HondaAutoMobile(9.30,10.0);
	hondaAutoMobile.setBrand("HONDA");
	hondaAutoMobile.setType("6 wheller");
	hondaAutoMobile.torisu();
	
	System.out.println("==========================");
	TataAutoMobile tataAutoMobile=new TataAutoMobile();
	tataAutoMobile.setBrand("watch");
	tataAutoMobile.setType("innova");
	tataAutoMobile.torisu();
	
	
	}

}

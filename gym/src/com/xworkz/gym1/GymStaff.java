package com.xworkz.gym1;

import com.xworkz.gym.GymRules;

public class GymStaff {
	
	private GymRules gymrules;
	
	 public GymStaff(GymRules gymrules) {
		 System.out.println("Running paramater constructer of gymrules");
		 this.gymrules=gymrules;
	 }
	
	public void checkTheRules() {
		double monthlyFees = this.gymrules.monthlyFees();
boolean unisex = this.gymrules.unisex();
boolean wearShoes = this.gymrules.wearShoes();
	if(wearShoes && monthlyFees >200) {
		System.out.println("rules are followed");
	}
	else {
		System.err.println("rules are not followed");
	}
	}
	
	public void mainteance() {
		
		System.out.println("maintaining clean");
		
	}

}

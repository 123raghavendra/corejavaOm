package com.xworkz.gym1;

import com.xworkz.gym.GymRules;
import com.xworkz.gym.PrajwalRules;

public class Bugger {
	public static void main(String[] args) {
		GymRules gymRules=new PrajwalRules();
		
		GymStaff gymStaff=new GymStaff(gymRules);
		gymStaff.checkTheRules();
		gymStaff.mainteance();
	}
}

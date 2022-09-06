package com.xworkz.krishanpginter;

public class Bugger {
	public static void main(String[] args) {
	 
		ITRuleFollower itRuleFollower = new ITRuleFollower();  //ways of object creation 1
		itRuleFollower.applylevels();
		itRuleFollower.harrasment();
		itRuleFollower.informLeve();
		itRuleFollower.parkingApproval();
		itRuleFollower.swipeCard();
		itRuleFollower.wfh();
		
	
		System.out.println(itRuleFollower.name);
		
		//String name = itRuleFollower.name;
		//System.out.println(name);
		
		
		System.out.println("++++++++++++++++++++");	
		 HRRules hrRules= new ITRuleFollower(); // 2 ways
		 hrRules.applylevels();
		 hrRules.harrasment();
		 System.out.println(hrRules.name);
		 System.out.println("===============");
		 
		  ManagerRules managerRules=new ITRuleFollower(); //3 ways
		  managerRules.informLeve();
		  managerRules.wfh();
		  
		  System.out.println("========================");
		  
		  SecurityRules securityRules= new ITRuleFollower();// 4 ways 
		  securityRules.parkingApproval();
		  securityRules.swipeCard();
		  
		  System.out.println("=====================================");
		  
			
			
		
		
	}

}

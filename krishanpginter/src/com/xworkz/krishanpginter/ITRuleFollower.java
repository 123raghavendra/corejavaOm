package com.xworkz.krishanpginter;

public  class ITRuleFollower  implements  HRRules,SecurityRules,ManagerRules {

   public  String name="raghu";
	
	
	@Override
	public boolean informLeve() {
		System.out.println("running informlevel");
		return false;
	}

	@Override
	public boolean wfh() {
	System.out.println("running wfh");
		return false;
	}

	@Override
	public boolean swipeCard() {
		System.out.println("running swipecard");
		return false;
	}

	@Override
	public boolean parkingApproval() {
System.out.println("parkingapproval");
boolean m=true;
		return m;
	}

	@Override
	public boolean applylevels() {
	System.out.println("applylevels");
		return false;
	}

	@Override
	public boolean harrasment() {
		System.out.println("running harrasment");
		return false;
	}
	

}

package com.xwrokz.petrolbunk;

public class Bugger {

	public static void main(String[] args) {

	PetrolBunkRules pRules=new Follower();
	pRules.workingTime();

	 System.out.println(pRules.NAME);
// OR Calling another way
	//String name = pRules.NAME;
	//System.out.println(name);
	
	User user=new User(pRules);
	
	user.checkRules();
	
	
		
	}

}

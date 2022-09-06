package com.xworkz.pubinterface1.example;

public class Bugger {
	public static void main(String[] args) {
		
		PubRule pubRule=new CustomerPubRules();
		DownTownPub downTownPub= new DownTownPub(pubRule);
		downTownPub.checkRules();
	
		
	}

}

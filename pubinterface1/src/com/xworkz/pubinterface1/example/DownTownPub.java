package com.xworkz.pubinterface1.example;

public class DownTownPub {

	private PubRule pubRule;

	/*
	 * public DownTownPub() { "if we write a default constructor we get null point
	 * exception }
	 */

	public DownTownPub(PubRule pubRule) {

		this.pubRule = pubRule;
		System.out.println("constructor created");
	}

	boolean checkRules() {
		boolean dressCodefollowed = this.pubRule.dressCodefollowed();
		boolean validProof = this.pubRule.validProof();
		int age = this.pubRule.age();
		if (dressCodefollowed && age >21 && validProof) {
			System.out.println("rules are followed");
		} else {
			System.err.println("rules are not followed");

		}

		return true;

	}

}

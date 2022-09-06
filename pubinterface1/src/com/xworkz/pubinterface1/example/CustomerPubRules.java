package com.xworkz.pubinterface1.example;

public class CustomerPubRules implements PubRule {

	@Override
	public boolean dressCodefollowed() {
		System.out.println("running dresscode followed");
		return true;
	}

	@Override
	public int age() {
		System.out.println("running age");
		return 20;
	}

	@Override
	public boolean validProof() {
		System.out.println("running validproof");
		return false;
	}

}

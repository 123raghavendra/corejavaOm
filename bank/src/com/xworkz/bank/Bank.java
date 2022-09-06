package com.xworkz.bank;

import com.xworkz.bankrules.BankRules;

public class Bank {
	
	private BankRules bankRules;

	public Bank(BankRules bankRules) {
		
		this.bankRules = bankRules;
		System.out.println("msbjhvscgasx");
	}
	public void check() {
		boolean passBook = this.bankRules.passBook();
		if(passBook) {
			System.out.println("rules are followed ");
		}
		else {
			System.out.println("rues are not followed");
		}
	}
	
	
	

}

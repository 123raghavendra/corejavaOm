package com.xworkz.bankmanagement;

import com.xworkz.bankrules.BankRules;

public class BankManagement implements BankRules {

	@Override
	public boolean passBook() {
		
		System.out.println("manoj is bringing the pass book");
		
		
		return true;
	}

}

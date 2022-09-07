package com.xworkz.bankrunner;

import com.xworkz.bank.Bank;
import com.xworkz.bankmanagement.BankManagement;
import com.xworkz.bankrules.BankRules;

public class BankRunner {
	
	public static void main(String[] args) {
		
	
	BankRules bankRules=new  BankManagement();
	
	Bank bank=new Bank(bankRules);
	bank.check();

	}
         
	

}

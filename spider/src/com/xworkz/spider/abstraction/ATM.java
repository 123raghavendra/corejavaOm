package com.xworkz.spider.abstraction;

public class ATM  implements Bank{
	
	 int balance=10000;
	
	
	public void deposit(int amount) {
		System.out.println("depositing the balance Rs."+amount);
		balance=balance+amount;
		System.out.println("Depositing the amount sucessfully");
		
	}
	
	public void withdraw(int amount) {
		System.out.println("withdrawing the amount Rs."+ amount);
	balance=balance-amount;
	System.out.println("Withdrawing the amount sucessfully");
	
	
	}
	
	public void checkBalance() {
		System.out.println("available balance Rs."+balance);
	}

	}



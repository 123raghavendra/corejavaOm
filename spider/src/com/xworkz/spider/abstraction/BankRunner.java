package com.xworkz.spider.abstraction;

public class BankRunner {

	public static void main(String[] args) {

		Bank atm = new ATM();
		atm.checkBalance();

		System.out.println("=====================");

		atm.deposit(5000);
		atm.checkBalance();

		System.out.println("====================");

		atm.withdraw(2000);
		atm.checkBalance();

		System.out.println("++++++++++++++++++++++++++");

	}

}

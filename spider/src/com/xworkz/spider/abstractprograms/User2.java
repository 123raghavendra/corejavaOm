package com.xworkz.spider.abstractprograms;

public class User2 extends Bike2 {

	@Override
	void start() {
		System.out.println("Bike is started ");
	}

	@Override
	int stop() {
		System.out.println(" Bike is stopping ");
		return 100;
	}

	// optionally caling the concrete method
	public static void main(String[] args) {

		User2 user2 = new User2();
	     user2.start();
		System.out.println("==============");
		int price = user2.price();
		System.out.println(price);
		System.out.println("=========");
		user2.stop();

	}

}

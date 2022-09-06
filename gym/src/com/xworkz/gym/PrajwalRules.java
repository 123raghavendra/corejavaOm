package com.xworkz.gym;

public class PrajwalRules implements GymRules {

	@Override
	public boolean unisex() {
		System.out.println("running unisex");
		return true;
	}

	@Override
	public double monthlyFees() {
		System.out.println("running monthly fees");
		return 500;
	}

	@Override
	public boolean wearShoes() {
		System.out.println("running wearshoes");
		return true;
	}

}

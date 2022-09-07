package com.xwrokz.petrolbunk;

public class Follower implements PetrolBunkRules {
	

	@Override
	public boolean fireSafety() {
		System.out.println("Running fireSafety Method");
		return true;
	}

	@Override
	public boolean toilet() {
		System.out.println("running toilet Method");
		return true;
	}

	@Override
	public boolean mobileUsage() {
		System.out.println("running MobileUsage Method");
		return true;
	}

}

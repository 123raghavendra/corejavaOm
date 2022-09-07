package com.xwrokz.petrolbunk;

public interface PetrolBunkRules {

	public String NAME = "RAGHU";

	public boolean fireSafety();

	public boolean toilet();

	public boolean mobileUsage();

	default boolean workingTime() {// By using default method without implement we can use
		System.out.println("Running the working time");
		return false;
	}
}

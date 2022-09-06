package com.xwrokz.petrolbunk;

public class User {
	
	private PetrolBunkRules pRules;
	
	/*public User() {
	if we write a default constructor we get a null point exception 
	}*/

	public User(PetrolBunkRules pRules) {
      this.pRules=pRules;
      System.out.println("constructor created ");
 }
	
	public boolean checkRules() {
		boolean safety = this.pRules.fireSafety();
		boolean usage = this.pRules.mobileUsage();
		boolean toilet = this.pRules.toilet();
		
		if(safety&&usage&&toilet ) {
			System.out.println("following the petrol bunk rules");
			
		}
		else {
			System.out.println("not following the petrol bunk rules");
		}
		return false;
		
	}
	
}

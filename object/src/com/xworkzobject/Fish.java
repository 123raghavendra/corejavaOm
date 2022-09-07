package com.xworkzobject;

public class Fish {
	private String name;
	private String type;

	public Fish(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Fish) {
				System.out.println("obj is Fish type ");
				Fish converted = (Fish) obj;
				String string = converted.name;
				String string2 = converted.type;
				if (this.equals(string) && this.equals(string2)) {
					System.out.println("both r same");
					return true;
				} else {
					System.out.println("both r not equal");
				}

			}
			else {
				System.out.println("obj is not Fish type");
			}
		}
			
			
			
			else {
				System.out.println("obj is null");
				}
		

		
		
		return super.equals(obj);
	}

}

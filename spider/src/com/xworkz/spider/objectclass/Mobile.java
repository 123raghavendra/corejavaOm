package com.xworkz.spider.objectclass;

// equals method 
public class Mobile {

	int id;
	double price;

	public Mobile(int id, double price) {

		this.id = id;
		this.price = price;
	}

	public boolean equals(Object obj) {
		Mobile mobile = (Mobile) obj;// down casting for to check the object comperasion
		return this.id == mobile.id && this.price == mobile.price;// now it will checking the object logic for compersion to check object
	}

	public static void main(String[] args) {
		Mobile mobile = new Mobile(1, 3000.00);
		Mobile mobile1 = new Mobile(2, 3000.00);

		// before object comperasion
		System.out.println(mobile.equals(mobile1));// false -- before overriding the equals method. it will checking the
													// adress of object
		System.out.println("-------------------------");
		// after overriding the equals method it will checking the object comparassion
		System.out.println(mobile.equals(mobile1));
		System.out.println("-------------------------");



	}

}

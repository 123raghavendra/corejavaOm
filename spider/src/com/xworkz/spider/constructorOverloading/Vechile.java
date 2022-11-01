package com.xworkz.spider.constructorOverloading;

public class Vechile {

	Vechile() {
		System.out.println("Defacult constructor of vechile ");
	}

	Vechile(String brand, String fuel) {
		System.out.println("Brand:" + brand +"  "+ " Fuel:" + fuel);

	}

	Vechile(String brand, int price) {
		System.out.println("Brand:" + brand +"   "+ "price:" + price);
	}

	Vechile(double price, String brand) {
		System.out.println("price:" + price+"  " + "brand: " + brand);
	}

	Vechile(String brand, int price, String owner) {
		System.out.println("brand:" + brand+" " + "price:" + price +"  "+ "owner: " + owner);
	}
	public static void main(String[] args) {
		Vechile vechile=new Vechile();
		Vechile vechile2=new Vechile(10000.00, "audi");
		Vechile vechile3=new Vechile("BMW", 19000000);
		Vechile vechile4=new Vechile("MARUTI ", "PETROL");
		Vechile vechile5=new Vechile("BMW", 200000000, "RAMYA");
	}
}



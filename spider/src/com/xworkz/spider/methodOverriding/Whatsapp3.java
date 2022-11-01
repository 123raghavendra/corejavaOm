package com.xworkz.spider.methodOverriding;

public class Whatsapp3  extends Whatsapp2{
	
	@Override
	public void display() {
		super.display();
		System.out.println("when msg send single tick,double tick & blue tick is visible");
	}
	
	@Override
	public void call() {
		super.call();
		System.out.println("Voice call and video call is avilable");
		
	}
	
	public void story() {
		System.out.println("Putting story as a image");
	}
	

}

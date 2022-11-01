package com.xworkz.spider.methodOverriding;

public class Whatsapp2  extends WhatsApp1{

	@Override
	public void display() {
		super.display();
		System.out.println("when msg send single tick  & double tick ");
	}
	public void call() {
		System.out.println("Voice call is avilable");
	}
	
}


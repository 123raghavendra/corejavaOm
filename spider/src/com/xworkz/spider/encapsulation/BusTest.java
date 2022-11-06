package com.xworkz.spider.encapsulation;

public class BusTest {

	public static void main(String[] args) {
Bus bus=new Bus();
bus.setbusName("KSRTC");
String name=bus.getName();
System.out.println(name);



Bus bus2=new Bus();
bus2.setbusName("VRL");
String name2 = bus2.getName();
System.out.println(name2);
 
		
	}

}

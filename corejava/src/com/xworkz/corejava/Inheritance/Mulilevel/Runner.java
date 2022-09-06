package com.xworkz.corejava.Inheritance.Mulilevel;

public class Runner {
	public static void main(String[] args) {
		
		Cricket cricket=new Cricket("yuvarj","india","male");
		//cricket.torisu();
	//System.out.println	(cricket.entertainment());
	boolean entertainment =cricket.entertainment();
	System.out.println(entertainment);
	
	System.out.println(cricket.presentation());
	cricket.torisu();
	
	System.out.println("====================");
	
	 Cricket  test=new Test();
	 System.out.println(test.presentation());
	 test.captian="kohili";
	 test.country="india";
	 test.gender="male";
	 test.torisu();
	 
	 System.out.println("==========================");
	 
	 T20 t20 =new T20();
	 System.out.println(t20.manofthematch());
	 System.out.println(t20.presentation());
String 	abc=t20.groundType="flat";
	 System.out.println(abc);
	 
	}

}

package com.xworkz.aptitudeprograms.basicprogram;

public class StringRev {
	
	
	
	public static void main(String[] args) {
		char l;
		String name="sarath";//htaras
		for(int i=name.length();i>0;i--) {
			 l = name.charAt(i-1);
			System.out.println(l);
			//System.out.println("gdjSD");
		//	System.out.print(name.charAt(i-1));//h//t//a//r//a//s//
			
		}
		int i=name.length();
		while(i>0) {
			System.out.println(name.charAt(i-1));
			i--;
		}
		
		
		
		
		
		
	}

}

package com.xworkz.aptitudeprograms.basicprogram;

public class StringReverse {
	
	
	
	public static void main(String[] args) {
		   boolean b = checkPalindrome("mmmmmmmmm");//false
		   System.out.println(b);
		
		
		
	}
	public static boolean checkPalindrome(String str) {
		 StringBuffer buffer = new StringBuffer(str);
		 StringBuffer reverse = buffer.reverse();
		 String rev = reverse.toString();
           if(rev.equals(str)) {
        	   
        	   
        	   return true;
           }
		return false;
	}

}

package com.xworkz.corejava1.forloop;

import java.lang.reflect.Array;
import java.text.DateFormatSymbols;
import java.util.Arrays;

public class Month {

	//public static void main(final String[] args) {
		//Arrays.stream(java.time.Month.values()).forEach(ref -> System.out.println(ref));
	//}
	
	public static void main(String[] args) {
		
		DateFormatSymbols dateFormatSymbols= new DateFormatSymbols();
		String[] months = dateFormatSymbols.getMonths();
		for (String string : months) {
		System.out.println(string);	
		}
	}
}

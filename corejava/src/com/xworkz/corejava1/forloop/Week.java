package com.xworkz.corejava1.forloop;

import java.text.DateFormatSymbols;

public class Week {

	public static void main(String[] args) {

		DateFormatSymbols dateFormatSymbols=new DateFormatSymbols();
		
		String [] week=dateFormatSymbols.getWeekdays();
		
		for (String string : week) {
		System.out.println(string);	
		}
	}

}

package com.xworkz.corejava1.forloop;

import java.text.DateFormatSymbols;

public class Week2 {

	public static void main(String[] args) {

		DateFormatSymbols dateFormatSymbols=new DateFormatSymbols();
		String [] week=dateFormatSymbols.getShortWeekdays();
		for(String string:week) {
			System.out.println(string);
		}
	}

	//@Override
//	public String toString() {
		//return "Week2 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
		//		+ "]";
	//}

}

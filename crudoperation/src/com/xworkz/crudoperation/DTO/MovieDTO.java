package com.xworkz.crudoperation.DTO;

import java.util.Arrays;

public class MovieDTO {
	
	private String movieName;
	private String[] actrossName;
	private int budjet;
	private int totalCollection;
	private String [] producerName;
	private int monthlyIncome;
	private String [] comedyActross;
	
public MovieDTO() {
System.out.println("MovieDTO created");
}

@Override
public String toString() {
	return "MovieDTO [movieName=" + movieName + ", actrossName=" + Arrays.toString(actrossName) + ", budjet=" + budjet
			+ ", totalCollection=" + totalCollection + ", producerName=" + Arrays.toString(producerName)
			+ ", monthlyIncome=" + monthlyIncome + ", comedyActross=" + Arrays.toString(comedyActross) + "]";
}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public String[] getActrossName() {
	return actrossName;
}

public void setActrossName(String[] actrossName) {
	this.actrossName = actrossName;
}

public int getBudjet() {
	return budjet;
}

public void setBudjet(int budjet) {
	this.budjet = budjet;
}

public int getTotalCollection() {
	return totalCollection;
}

public void setTotalCollection(int totalCollection) {
	this.totalCollection = totalCollection;
}

public String[] getProducerName() {
	return producerName;
}

public void setProducerName(String[] producerName) {
	this.producerName = producerName;
}

public int getMonthlyIncome() {
	return monthlyIncome;
}

public void setMonthlyIncome(int monthlyIncome) {
	this.monthlyIncome = monthlyIncome;
}

public String[] getComedyActross() {
	return comedyActross;
}

public void setComedyActross(String[] comedyActross) {
	this.comedyActross = comedyActross;
}


}

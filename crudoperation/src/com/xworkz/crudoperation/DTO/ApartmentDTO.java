package com.xworkz.crudoperation.DTO;

import java.io.Serializable;
import java.util.Arrays;

public class ApartmentDTO implements Serializable {

	private String appartmentName;
	private int noOfFloors;
	private String[] appartmentColour;
	private boolean compoundAvailable;
	private boolean swimingPool;
	private boolean camera;
	private boolean parking;
	private boolean solar;
	private boolean lift;
	private boolean waterTank;
	private boolean security;
	private boolean garden;
	private double constructionCost;
	private boolean stairCase;
	private boolean coridor;

	public ApartmentDTO() {
		System.out.println("Default constructor of appartment created");
	}

	@Override
	public String toString() {
		return "ApartmentDTO [appartmentName=" + appartmentName + ", noOfFloors=" + noOfFloors + ", appartmentColour="
				+ Arrays.toString(appartmentColour) + ", compoundAvailable=" + compoundAvailable + ", swimingPool="
				+ swimingPool + ", camera=" + camera + ", parking=" + parking + ", solar=" + solar + ", lift=" + lift
				+ ", waterTank=" + waterTank + ", security=" + security + ", garden=" + garden + ", constructionCost="
				+ constructionCost + ", stairCase=" + stairCase + ", coridor=" + coridor + "]";
	}

	public String getAppartmentName() {
		return appartmentName;
	}

	public void setAppartmentName(String appartmentName) {
		this.appartmentName = appartmentName;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public String[] getAppartmentColour() {
		return appartmentColour;
	}

	public void setAppartmentColour(String[] appartmentColour) {
		this.appartmentColour = appartmentColour;
	}

	public boolean isCompoundAvailable() {
		return compoundAvailable;
	}

	public void setCompoundAvailable(boolean compoundAvailable) {
		this.compoundAvailable = compoundAvailable;
	}

	public boolean isSwimingPool() {
		return swimingPool;
	}

	public void setSwimingPool(boolean swimingPool) {
		this.swimingPool = swimingPool;
	}

	public boolean isCamera() {
		return camera;
	}

	public void setCamera(boolean camera) {
		this.camera = camera;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isSolar() {
		return solar;
	}

	public void setSolar(boolean solar) {
		this.solar = solar;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public boolean isWaterTank() {
		return waterTank;
	}

	public void setWaterTank(boolean waterTank) {
		this.waterTank = waterTank;
	}

	public boolean isSecurity() {
		return security;
	}

	public void setSecurity(boolean security) {
		this.security = security;
	}

	public boolean isGarden() {
		return garden;
	}

	public void setGarden(boolean garden) {
		this.garden = garden;
	}

	public double getConstructionCost() {
		return constructionCost;
	}

	public void setConstructionCost(double constructionCost) {
		this.constructionCost = constructionCost;
	}

	public boolean isStairCase() {
		return stairCase;
	}

	public void setStairCase(boolean stairCase) {
		this.stairCase = stairCase;
	}

	public boolean isCoridor() {
		return coridor;
	}

	public void setCoridor(boolean coridor) {
		this.coridor = coridor;
	}

}

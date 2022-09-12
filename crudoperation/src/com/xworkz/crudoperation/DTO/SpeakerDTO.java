package com.xworkz.crudoperation.DTO;

public class SpeakerDTO {
	
	private String brand;
	private String color;
	private int price;
	private int volumeUpto;
	private String shape;
	private boolean warranty;
	private boolean guarntee;
	private boolean stand;
	private boolean woofer;
	private boolean remote;
	private boolean buttonSystem;
	private boolean usb;
	private boolean fm;
	private boolean lighting;
	
	public SpeakerDTO() {
System.out.println("default constructor of speaker");	
}

	@Override
	public String toString() {
		return "Speaker [brand=" + brand + ", color=" + color + ", price=" + price + ", volumeUpto=" + volumeUpto
			+ ", shape=" + shape + ", warranty=" + warranty + ", guarntee=" + guarntee + ", stand=" + stand
				+ ", woofer=" + woofer + ", remote=" + remote + ", buttonSystem=" + buttonSystem + ", usb=" + usb
				+ ", fm=" + fm + ", lighting=" + lighting + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVolumeUpto() {
		return volumeUpto;
	}

	public void setVolumeUpto(int volumeUpto) {
		this.volumeUpto = volumeUpto;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public boolean isWarranty() {
		return warranty;
	}

	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}

	public boolean isGuarntee() {
		return guarntee;
	}

	public void setGuarntee(boolean guarntee) {
		this.guarntee = guarntee;
	}

	public boolean isStand() {
		return stand;
	}

	public void setStand(boolean stand) {
		this.stand = stand;
	}

	public boolean isWoofer() {
		return woofer;
	}

	public void setWoofer(boolean woofer) {
		this.woofer = woofer;
	}

	public boolean isRemote() {
		return remote;
	}

	public void setRemote(boolean remote) {
		this.remote = remote;
	}

	public boolean isButtonSystem() {
		return buttonSystem;
	}

	public void setButtonSystem(boolean buttonSystem) {
		this.buttonSystem = buttonSystem;
	}

	public boolean isUsb() {
		return usb;
	}

	public void setUsb(boolean usb) {
		this.usb = usb;
	}

	public boolean isFm() {
		return fm;
	}

	public void setFm(boolean fm) {
		this.fm = fm;
	}

	public boolean isLighting() {
		return lighting;
	}

	public void setLighting(boolean lighting) {
		this.lighting = lighting;
	}
	
}
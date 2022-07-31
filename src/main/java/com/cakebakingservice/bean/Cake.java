package com.cakebakingservice.bean;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Cake {
	@NotNull(message = "Must select one option")
	private int selectedcake;
	private String flavor;
	private int flavorRate;
	private int includeCandles;
	private int includeIncreption;
	private String theIncreption;
	@NotEmpty(message = "Name is required")
	private String name;
	@NotEmpty(message = "Address is required")
	private String address;
	@NotEmpty(message = "Phone number is required")
	@Pattern(regexp = "^[\\d]{10}$", message = "Phone number should be 10 digits")
	private String phoneNumber;
	private double price;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSelectedcake() {
		return selectedcake;
	}

	public void setSelectedcake(int selectedcake) {
		this.selectedcake = selectedcake;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getFlavorRate() {
		return flavorRate;
	}

	public void setFlavorRate(int flavorRate) {
		this.flavorRate = flavorRate;
	}

	public int getIncludeCandles() {
		return includeCandles;
	}

	public void setIncludeCandles(int includeCandles) {
		this.includeCandles = includeCandles;
	}

	public int getIncludeIncreption() {
		return includeIncreption;
	}

	public void setIncludeIncreption(int includeIncreption) {
		this.includeIncreption = includeIncreption;
	}

	public String getTheIncreption() {
		return theIncreption;
	}

	public void setTheIncreption(String theIncreption) {
		this.theIncreption = theIncreption;
	}

	public String getName() {
		return name;
	}

	public Cake() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

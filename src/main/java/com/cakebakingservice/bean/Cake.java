package com.cakebakingservice.bean;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Cake {
	@NotNull(message = "Must select one option")
	private Integer selectedcake;
	private String flavor;
	private Integer flavorRate;
	private Integer includeCandles;
	private Integer includeIncreption;
	private String theIncreption;
	@NotEmpty(message = "Name is required")
	private String name;
	@NotEmpty(message = "Address is required")
	private String address;
	@NotEmpty(message = "Phone number is required")
	@Pattern(regexp = "^[\\d]{10}$", message = "Phone number should be 10 digits")
	private String phoneNumber;
	private double price;

	public Integer getSelectedcake() {
		return selectedcake;
	}

	public void setSelectedcake(Integer selectedcake) {
		this.selectedcake = selectedcake;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public Integer getFlavorRate() {
		return flavorRate;
	}

	public void setFlavorRate(Integer flavorRate) {
		this.flavorRate = flavorRate;
	}

	public Integer getIncludeCandles() {
		return includeCandles;
	}

	public void setIncludeCandles(Integer includeCandles) {
		this.includeCandles = includeCandles;
	}

	public Integer getIncludeIncreption() {
		return includeIncreption;
	}

	public void setIncludeIncreption(Integer includeIncreption) {
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

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

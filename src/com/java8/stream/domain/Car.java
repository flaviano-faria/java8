package com.java8.stream.domain;

public class Car {
	
	private String model;
	private int year;
	
	public Car(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}
	
	public Car() {
		super();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

}

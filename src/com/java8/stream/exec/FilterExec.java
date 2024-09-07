package com.java8.stream.exec;

import com.java8.stream.filter.CarService;

public class FilterExec {

	public static void main(String[] args) {
		
		CarService service = new CarService();
		
		service.getAboveYear(1990);
		
		service.getAllCars();
		service.getYearByModel();
	}
}

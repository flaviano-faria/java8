package com.java8.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.adapter.CarAdapter;
import com.java8.adapter.CarAdapterImpl;
import com.java8.interfaces.ICarAdapter;
import com.java8.stream.domain.Car;

public class CarService {
	
	public void getAboveYear(int year){
		
		CarAdapterImpl carAdapterImpl = new CarAdapterImpl();
		ICarAdapter carAdapter = new CarAdapter(carAdapterImpl);
		
		ArrayList filteredList = (ArrayList) carAdapter.getCarList().stream().filter(e -> 
		((Car) e).getYear()> year).collect(Collectors.toList());
		filteredList.stream().forEach(e -> System.out.println(((Car) e).getYear() + " "+((Car) e).getModel()));
	}
	
	
	public void getAllCars() {
		CarAdapterImpl carAdapterImpl = new CarAdapterImpl();
		ICarAdapter carAdapter = new CarAdapter(carAdapterImpl);
		
		carAdapter.getCarList().stream().forEach(e -> System.out.println(((Car) e).getModel()));
	}
}

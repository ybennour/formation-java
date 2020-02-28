package com.collections.un;

import java.util.HashMap;
import java.util.Map;

import com.vehicles.Car;

public class Program {
	public static void main(String[] args) {
		Map<String, Car> carsMap = new HashMap<String, Car>(); 
		carsMap.put("David", new Car("Testa", "S", "Red", 2019, 150));
		carsMap.put("John", new Car("Toyoya", "V40", "Black", 2018, 170));
		carsMap.put("Thomas", new Car("VW", "Golf", "Grey", 2017, 140));
	}
}

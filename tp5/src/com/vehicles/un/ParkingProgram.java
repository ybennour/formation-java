package com.vehicles.un;

import com.vehicles.un.Car.Engine;

public class ParkingProgram {

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model S", "Black", 2015);
        Engine engineCar1 = car1.new Engine(150);
        car1.setEngine(engineCar1);
        
        Car car2 = new Car("Volvo", "V40", "Grey", 2019);
        Engine engineCar2 = car2.new Engine(180);
        car2.setEngine(engineCar2);
        
        System.out.println("Marque de la voiture 1 " + car1.getBrand());
        System.out.println("Marque de la voiture 2 " + car2.getBrand());
    }
}

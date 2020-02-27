package com.vehicles.deux;

public class ParkingProgram {

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model S", "Black", 2015, 150);
        
        Car car2 = new Car("Volvo", "V40", "Grey", 2019, 180);

        System.out.println("Marque de la voiture 1 " + car1.getBrand());
        System.out.println("Marque de la voiture 2 " + car2.getBrand());
    }
}

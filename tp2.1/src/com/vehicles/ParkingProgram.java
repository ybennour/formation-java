package com.vehicles;

public class ParkingProgram {

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model S");
        Car car2 = new Car("Volvo", "V40");

        System.out.println("Marque de la voiture 1 : " + car1.brand);
        System.out.println("Marque de la voiture 2 : " + car2.brand);
    }
}

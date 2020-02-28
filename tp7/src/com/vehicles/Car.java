package com.vehicles;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int year;
    private Engine engine;

    public Car(String brand, String model, String color, int year, int power) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.engine = new Engine(power);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	private class Engine {
    	
    	private Integer power;
    	
		public Engine(Integer power) {
			this.power = power;
		}

		public Integer getPower() {
			return power;
		}

		public void setPower(Integer power) {
			this.power = power;
		}
    	
    	
    }
}

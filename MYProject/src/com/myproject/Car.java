package com.myproject;

public class Car {
	String brand;
	String model;
	double price;
	String engNo;
	
	
	Car (String brand, String model, double price, String engNo) {
		this.brand = brand;
		this.model= model;
		this.price = price;
		this.engNo = engNo;
		System.out.println(4);
	}
	Car (String brand, String model, double price) {
		this("BMW", "M4", 50000.00, "5rffa56788xbaxj");
		System.out.println(3);
	}
	Car (String brand, String model) {
		this("BMW", "M4", 50000.00);
		System.out.println(2);
	}
	Car () {
		this("BMW", "M4");
		System.out.println(1);
	}
	
	void Car() {
		System.out.println("Brand of Car  : " + brand);
		System.out.println("Model of Car  : "+ model);
		System.out.println("Price of car  : " + price);
		System.out.println("Car Engine No : " + engNo);
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Car c1 = new Car();
		c1.Car();
	}

}

package com.myproject;

class Vehicle {
	String brand;

	public Vehicle(String brand) {
		this.brand = brand;
	}

}

class Car1 extends Vehicle {
	String model;
	String name;
	double price;

	public Car1(String brand, String model, String name, double price) {
		super(brand);
		this.model = model;
		this.name = name;
		this.price = price;
	}
}

class Electrocar extends Car1 {
	static int battery;

	public Electrocar(String brand, String model, String name, double price, int battery) {
		super(brand, model, name, price);
		this.battery = battery;
	}

	void display() {
		System.out.println("Car Brand is : " + brand);
		System.out.println("Car Model is : " + model);
		System.out.println("Car Name is : " + name);
		System.out.println("Car Price is : " + price);
		System.out.println("Car Battery capacity is : " + battery);
	}
}

public class Constructorchaning {

	public static void main(String[] args) {
		Electrocar e1 = new Electrocar("Tata", "Tiago", "Tata Tiago", 50000, 55);
		e1.display();
	}

}

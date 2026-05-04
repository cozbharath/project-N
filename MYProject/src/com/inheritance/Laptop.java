package com.inheritance;

public class Laptop extends Device {

	void getOpenLid() {
		System.out.println("wakes up automatically when you open the lid");
	}

	public static void main(String[] args) {

		Laptop device = new Laptop();
		device.getShowDetails();
		device.display();
		device.getOpenLid();
	}

}

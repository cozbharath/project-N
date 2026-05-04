package com.inheritance;

import java.util.Scanner;

public class Device {
	static Scanner sc = new Scanner(System.in);

	public String brand;
	public String power;

	void getShowDetails() {

		System.out.println("Enter the Brand : ");
		brand = sc.next();

		System.out.println("Enter the Power : ");
		power = sc.next();

	}

	void display() {
		System.out.println("Brand : " + brand);
		System.out.println("Brand : " + power);
	}

}

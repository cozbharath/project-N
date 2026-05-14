package com.abstract1;

import java.util.Scanner;

public class Electronics implements Product {
	Scanner sc = new Scanner(System.in);

	String product;
	double price;

	@Override
	public void Buy(int quality) {
		System.out.println("Enter the name of the Product : ");
		product = sc.nextLine();

		System.out.println("Enter the Price of the Product : ");
		price = sc.nextDouble();

		double totalPrice = quality * price;

		System.out.println("\n--- Electronics Details ---");
		System.out.println("Product Name " + product);
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + quality);
		System.out.println("Total Price : " + totalPrice);
	}

}

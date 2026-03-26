package com.operator;

import java.util.Scanner;

public class ResturantBilling {

	public static void main(String[] args) {

		System.out.println("Welcome to My Foods");
		Scanner sc = new Scanner(System.in);

		String ad;
		int totalBill = 0;

		do {
			System.out.println("\nEnter Category (Pizza/Burger/Pasta):");
			String catg = sc.nextLine().toLowerCase();
			int price = 0;

			switch (catg) {

			case "pizza" -> {
				System.out.println("Enter Item:");
				String item = sc.nextLine().toLowerCase();

				switch (item) {
				case "veg pizza" -> price = 200;
				case "chicken pizza" -> price = 300;
				case "cheese pizza" -> price = 250;
				default -> System.out.println("Invalid Item");
				}
			}

			case "burger" -> {
				System.out.println("Enter Item:");
				String item = sc.nextLine().toLowerCase();

				switch (item) {
				case "veg burger" -> price = 120;
				case "chicken burger" -> price = 180;
				case "cheese burger" -> price = 150;
				default -> System.out.println("Invalid Item");
				}
			}

			case "pasta" -> {
				System.out.println("Enter Item:");
				String item = sc.nextLine().toLowerCase();

				switch (item) {
				case "veg pasta" -> price = 150;
				case "white sauce pasta" -> price = 220;
				case "red sauce pasta" -> price = 200;
				default -> System.out.println("Invalid Item");
				}
			}

			default -> System.out.println("Invalid Category");
			
			}
			if (price > 0) {
                System.out.println("Enter Quantity:");
                int qty = sc.nextInt();
                sc.nextLine(); // clear buffer

                int bill = price * qty;
                totalBill += bill;

                System.out.println("Item Price: " + price);
                System.out.println("Quantity: " + qty);
                System.out.println("Item Total: " + bill);
			}

			System.out.println("\nDo you want to order again? (yes/no):");
			ad = sc.nextLine();

		} while (ad.equalsIgnoreCase("yes"));

		System.out.println("\n========================");
        System.out.println("Total Bill: " + totalBill);
        System.out.println("Order Successfully Placed ✅");
        System.out.println("========================");

        sc.close();
	}
}
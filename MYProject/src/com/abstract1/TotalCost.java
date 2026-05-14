package com.abstract1;

import java.util.Scanner;

public class TotalCost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p1 = new Electronics();
		Product c1 = new Clothing();
		Product g1 = new Grocery();

		System.out.println("Enter the Electronic items : ");
		int r = sc.nextInt();
		sc.nextLine();
		p1.Buy(r);

		System.out.println("Enter the Cloths items : ");
		int r1 = sc.nextInt();
		sc.nextLine();
		c1.Buy(r1);

		System.out.println("Enter the Grocery items : ");
		int r2 = sc.nextInt();
		sc.nextLine();
		g1.Buy(r2);
	}

}

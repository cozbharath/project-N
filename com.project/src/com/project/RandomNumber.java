package com.project;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		System.out.println("Welcome to Random Number, Game !!");
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String ad;
		do {
			int rom = r.nextInt(10);

			int guss;
			int attempt = 0;
			do {
				System.out.println("Guss The Number : ");
				guss = sc.nextInt();
				attempt++;
				if (rom == guss) {
					System.out.println("Your guss is correct");
					System.out.println("You Won The Game !!");
					break;
				} else if (rom > guss) {
					System.out.println("Guss number is Greater Number");
				} else {
					System.out.println("Guss Number is Smallest");
				}
				if (attempt == 3) {
					System.out.println("You loos The game");
					System.out.println("The Guss Number is : " + rom);
					break;
				}
			} while (rom != guss);
			sc.nextLine();

			System.out.println("\nDo you want to play again? (yes/no):");
			ad = sc.nextLine();
		} while (ad.equalsIgnoreCase("yes"));
		System.out.println("Thankyou for playing");

	}

}

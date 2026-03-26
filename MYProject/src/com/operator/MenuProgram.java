package com.operator;

import java.util.Scanner;

public class MenuProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Exit");

		System.out.println("Enter your choice:");
		int choice = sc.nextInt();

		if (choice == 4) {
			System.out.println("Exit");
			return;
		}

		System.out.println("Enter first number:");
		int a = sc.nextInt();

		System.out.println("Enter second number:");
		int b = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Result: " + (a + b));
			break;

		case 2:
			System.out.println("Result: " + (a - b));
			break;

		case 3:
			System.out.println("Result: " + (a * b));
			break;

		default:
			System.out.println("Invalid Choice");
		}
	}
}

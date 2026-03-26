package com.operator;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();

		switch (a % 2) {
			case 0 -> {
				System.out.println("Even Number");
			}
			case 1 -> {
				System.out.println("Odd Number");
			}
			default -> System.out.println("Enter number is Invalid");
		}
	}

}

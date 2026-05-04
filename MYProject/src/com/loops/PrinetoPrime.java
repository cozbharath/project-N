package com.loops;

import java.util.Scanner;

public class PrinetoPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Enter a number : ");
			int a = sc.nextInt();

			if (isPrime(a)) {
				System.out.println("enter b value ");
				int b = sc.nextInt();
				int sum = a + b;
				if (isPrime(sum)) {
					System.out.println("sum is " + sum + " is  also prime number");
				} else {
					System.out.println("sum is not prime");
				}
			} else {
				System.out.println("Enter valid prime number to a variable");

			}
		}

	}

	static boolean isPrime(int n) {
		boolean status = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

}

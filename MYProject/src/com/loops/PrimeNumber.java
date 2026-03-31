package com.loops;

import java.util.Scanner;

public class PrimeNumber {

	static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		boolean status = isPrime(n);

		if (status) {
			System.out.println("The Given Number is Prime");
		} else {
			System.out.println("The Given Number is not Prime");
		}
	}

}

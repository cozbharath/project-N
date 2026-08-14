package com.loops;

//import java.util.Scanner;

public class PrimeNnumbers {

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			status = false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				count++;
				sum += i;
				System.out.print(i + " ");

			}
		}
		System.out.println();
		System.out.println(count);
		System.out.println(sum);
	}

}

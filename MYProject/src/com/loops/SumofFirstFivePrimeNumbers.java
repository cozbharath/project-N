package com.loops;

//import java.util.Scanner;

public class SumofFirstFivePrimeNumbers {
	public static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return status = false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0)

				return status = false;
		}
		return status;
	}

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;

		for (int i = 1; i <= 20; i++) {
			if (isPrime(i)) {
				sum = sum + i;
				count++;
				if (count == 5) {
					break;
				}
			}
		}
		if (sum % 2 == 0) {
			System.out.println(sum + " : Even Number ");
		} else {
			System.out.println(sum + " : Odd Number");
		}
	}

}

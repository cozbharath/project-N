package com.loops;

public class ReverseOfPrimeNumber {

	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9, 9 };

		System.out.println("Prime Numbers in Reverse Order:");
		
		for (int i = arr.length - 1; i >= 0; i--) {

			if (isPrime(arr[i])) {

				System.out.print(arr[i] + " ");
			}
		}
	}

}

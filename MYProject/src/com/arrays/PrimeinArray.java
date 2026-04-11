package com.arrays;

import java.util.Scanner;

public class PrimeinArray {
	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
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
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of an Array : ");
		int size = sc.nextInt();
		int[] n = new int[size];
		System.out.println("Enter the values in an Array");
		for (int i = 0; i < size; i++) {
			n[i] = sc.nextInt();
		}
//		for (int i = 0; i < size; i++) {
//			boolean status = isPrime(n[i]);
//			if (status) {
//				System.out.print(n[i] + " ");
//			} else {
//				System.out.println("Prime Number find not Find");
//				break;
//			}
//		}
		for (int a : n) {
			boolean status = isPrime(a);
			if (status) {
				System.out.print(a + " ");
			} else {
				System.out.println("Prime Number find not Find");
				break;
			}
		}
	}

}

package com.loops;

import java.util.Scanner;

public class RangeSumPrime {
	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Start Number : ");
		int n = sc.nextInt();
		System.out.println("Enter th Nth Number : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = n; i <= num; i++) {
			if (isPrime(i)) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of Prime Numbers : " + sum);
	}

}

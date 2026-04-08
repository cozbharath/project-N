package com.loops;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");

		int n = sc.nextInt();

		int sum = 0;
		int temp = n;

		while (temp != 0) {
			int r = temp % 10;
			int fact = 1;
			for (int i = 1; i <= r; i++) {
				fact = fact * i;
			}
			sum += fact;
			temp = temp / 10;
		}
		if (sum == n) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not Strong Number");
		}

	}

}

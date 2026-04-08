package com.loops;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int sum = num;
		while (sum > 9) {
			int temp = sum;
			sum = 0;
			while (temp > 0) {
				int r = temp % 10;
				sum += Math.pow(r, 2);
				temp = temp / 10;
			}
		}

		if (sum == 1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not Happy Number");
		}
		sc.close();
	}

}

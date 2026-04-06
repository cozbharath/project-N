package com.loops;

import java.util.Scanner;

public class MagicNumber {

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
				sum = sum + r;
				temp = temp / 10;
			}
		}

		if (sum == 1) {
			System.out.println("Magic Number");
		} else {
			System.out.println("Not Magic Number");
		}

	}

}

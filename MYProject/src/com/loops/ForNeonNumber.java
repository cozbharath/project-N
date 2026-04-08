package com.loops;

import java.util.Scanner;

public class ForNeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int square = num * num;
		int digit = 0;
		int sum = 0;
		for (; square != 0; square = square / 10) {
			digit = square % 10;
			sum += digit;
		}
		if (sum == num) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not Neon Number");
		}
		sc.close();
	}

}

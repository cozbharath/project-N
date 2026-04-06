package com.loops;

import java.util.Scanner;

public class SumOfDigitsinFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit : ");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;
		for (; n != 0; n = n / 10) {
			r = n % 10;
			sum += r;
		}
		System.out.println(sum);
	}

}

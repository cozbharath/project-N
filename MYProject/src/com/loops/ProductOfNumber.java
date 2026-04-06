package com.loops;

import java.util.Scanner;

public class ProductOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Digit to find Product : ");
		int n = sc.nextInt();
		int r = 0;
		int product = 1;
		for (; n != 0; n = n / 10) {
			r = n % 10;
			product = product * r;
		}
		System.out.println(product);
	}

}

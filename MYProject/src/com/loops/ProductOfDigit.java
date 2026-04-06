package com.loops;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Digit");
		int n = sc.nextInt();
		int r = 0;
		int pro = 1;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			pro = pro * r;

		}
		System.out.println("Product of the digit is :" + pro);
	}

}

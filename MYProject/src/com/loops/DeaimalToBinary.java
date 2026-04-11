package com.loops;

import java.util.Scanner;

public class DeaimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int r = 0;
		String rev = " ";
		while (n != 0) {
			r = n % 2;
			n = n / 2;
			rev = r + rev;
		}
		System.out.println("Binary Number are : " + rev);
	}

}

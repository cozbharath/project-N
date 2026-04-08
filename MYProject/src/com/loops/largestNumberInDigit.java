package com.loops;

import java.util.Scanner;

public class largestNumberInDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Digit : ");
		int n = sc.nextInt();
		int r = 0;
		int largest = 0;
		while (n > 0) {
			r = n % 10;
			if (r > largest) {
				largest = r;
			}
			n = n / 10;
		}
		System.out.println(largest);
		sc.close();
	}

}

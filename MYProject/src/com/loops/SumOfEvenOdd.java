package com.loops;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int even = 0;
		int evenCount = 0;
		int odd = 0;
		int oddCount = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				even += i;
				evenCount++;
			}

			if (i % 2 != 0) {
				odd += i;
				oddCount++;
			}
		}
		System.out.println("The Even Number : " + even);
		System.out.println("The Even Count : " + evenCount);

		System.out.println("The Odd Number : " + odd);

		System.out.println("The Odd Count : " + oddCount);
	}

}

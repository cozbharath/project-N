package com.loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		boolean status = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		if (status) {
			System.out.println("The Given Number is Prime");
		} else {
			System.out.println("The Given Number is not Prime");
		}
	}

}

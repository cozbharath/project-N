package com.loops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int sum = 0;
		getPerfectNumber(n,sum);
	}

	static void getPerfectNumber(int n, int sum) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
				
			}
		}
		
		if(sum == n) {
			System.out.println("Enter number Prefect");
		} else {
			System.out.println("Enter number not Prefect");
		}
		
		
	}

}

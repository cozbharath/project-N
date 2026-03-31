package com.loops;

import java.util.Scanner;

public class PerfectNumberMethods {

	static boolean isPrefect(int n) {

		boolean flag = true;
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			System.out.println("The Given Number is Prefect");
		} else {
			System.out.println("The Given Number is not Prefect ");
		}

		return flag;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		boolean status = isPrefect(n);
		sc.close();
	}

}

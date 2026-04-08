package com.loops;

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int square = 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			square = (int) Math.pow(i, 2);
			sum = sum + square;
			System.out.print(square + " ");
		}
		System.out.println();
		System.out.println("Sum of Square : " + sum);

	}

}

package com.loops;

import java.util.Scanner;

public class Cubes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int cube = 0;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			cube = (int) Math.pow(i, 3);
			sum += cube;
			System.out.print(cube + " ");
		}
		System.out.println();
		System.out.println("Sum of Cubes : " + sum);
	}

}

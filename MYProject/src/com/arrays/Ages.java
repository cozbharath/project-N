package com.arrays;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int size = sc.nextInt();
		int[] age = new int[size];
		System.out.println("Enter ages of Persons: ");
		for (int i = 0; i < size; i++) {
			age[i] = sc.nextInt();
		}
		int elgibleCount = 0;
		int notElgibleCount = 0;
		int oldVoter = Integer.MIN_VALUE;
		int youngVoter = Integer.MAX_VALUE;
		for (int b : age) {
			if (b >= 18) {
				elgibleCount++;
				if (b > oldVoter) {
					oldVoter = b;
				}
				if (b < youngVoter) {
					youngVoter = b;
				}

			} else {
				notElgibleCount++;
			}
		}
		System.out.println("Eligible Voters : " + elgibleCount);
		System.out.println("not Eligible Voters : " + notElgibleCount);
		System.out.println("Oldest  Voters : " + oldVoter);
		System.out.println("Youngest Voters : " + youngVoter);
	}

}

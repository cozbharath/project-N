package com.arrays;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an Array : ");
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.println("Enter values of an array : ");
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		for (int arr : num) {
			if (arr > max) {
				secondmax = max;
				max = arr;
			} else if (arr > secondmax && arr != max) {
				secondmax = arr;
			}
		}
		System.out.println("Second Max Value is : " + secondmax);
	}

}

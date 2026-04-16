package com.arrays;

import java.util.Scanner;

public class MaximumValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Elements of an array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum Element of an Array : " + max);
	}

}

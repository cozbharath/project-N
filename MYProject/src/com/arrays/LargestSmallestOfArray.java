package com.arrays;

import java.util.Scanner;

public class LargestSmallestOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Range of an Array : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter a Numbers : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for (int a : arr) {
			if (a < min) {
				min = a;
			} else if (a > max) {
				max = a;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}

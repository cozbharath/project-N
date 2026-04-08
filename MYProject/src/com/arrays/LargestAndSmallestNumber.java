package com.arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		int[] arr = { 10, 25, 5, 40, 15 };
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Minimum Value is :" + min);
		System.out.println("Maximum Value is :" + max);
	}

}

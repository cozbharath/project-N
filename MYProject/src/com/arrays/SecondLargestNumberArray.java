package com.arrays;

public class SecondLargestNumberArray {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 59, 34, 10 };
		int Max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > Max) {
				secondMax = Max;
				Max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != Max) {
				secondMax = arr[i];
			}
		}

		System.out.println("Second Max of Array : " + secondMax);
	}

}

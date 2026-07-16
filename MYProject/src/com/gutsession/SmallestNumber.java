package com.gutsession;

public class SmallestNumber {

	public static void main(String[] args) {
		int[] arr = { 12, 45, 67, 23, 89, 34 };
		int smallElement = isSmallestNumber(arr);
		System.out.println(smallElement);

	}

	public static int isSmallestNumber(int[] arr) {
		int sNumber = Integer.MAX_VALUE;
		for (int i = -0; i < arr.length; i++) {
			if (arr[i] < sNumber) {
				sNumber = arr[i];
			}
		}
		return sNumber;
	}

}

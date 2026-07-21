package com.stringhandling;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		isArrayRotate(arr, k);
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	public static void isArrayRotate(int[] arr, int k) {
		int start = 0;
		int end = arr.length - 1;

		// Reverse Array
		isReverse(arr, start, end);

		// FirstHalf Reverse
		isReverse(arr, start, k - 1);

		// Second Half Reverse
		isReverse(arr, k, end);

	}

	public static void isReverse(int[] arr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}

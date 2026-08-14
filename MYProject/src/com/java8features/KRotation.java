package com.java8features;

public class KRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		isRotate(arr, k);

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void isRotate(int[] arr, int k) {
		k = k % arr.length;
		int start = 0;
		int end = arr.length - 1;

		isReverse(arr, start, end);

		isReverse(arr, k, end);

		isReverse(arr, start, k - 1);

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

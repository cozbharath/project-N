package com.java8features;

public class MovingNegative {
	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, -4, 5, -6 };
		int temp = 0;
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			if (arr[j] < arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				i++;
				j--;
			}
		}

		for (int a : arr) {
			System.out.println(a + " ");
		}

	}
}

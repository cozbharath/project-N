package com.gutsession;

import java.util.Arrays;

public class MovingNegative {
	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, -4, 5, -6 };
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			while (i < j && arr[i] < 0) {
				i++;
			}
			while (i < j && arr[j] >= 0) {
				j--;
			}
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}
}

package com.arrays;

public class ReverseofEAndOD {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = arr.length - 1; j >= 0; j--) {
					if (i + j == arr.length - 1) {
						System.out.print(arr[i][j] * arr[i][j] + " "); // square
					} else {
						System.out.print(arr[i][j] + " ");
					}
				}
			} else {
				for (int j = 0; j < arr.length; j++) {
					if (i == j) {
						System.out.print(arr[i][j] * arr[i][j] + " ");
					} else {
						System.out.print(arr[i][j] * 2 + " ");
					}
				}

			}
			System.out.println();
		}
	}
}

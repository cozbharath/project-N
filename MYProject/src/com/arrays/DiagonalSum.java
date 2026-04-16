package com.arrays;

public class DiagonalSum {

	public static void isRightSum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j >= i; j--) {
				sum += arr[i][j];
			}
		}
		System.out.println("Sum of Right Diagonal : " + sum);
	}

	public static void isLeftSum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j <= i; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("Sum of Left Diagonal : " + sum);
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		isLeftSum(arr);
		isRightSum(arr);
	}

}

package com.arrays;

public class D2Array2 {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30 }, { 10, 20, 30 }, { 10, 20 } };
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		for (int[] num : arr) {
			for (int n : num) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}

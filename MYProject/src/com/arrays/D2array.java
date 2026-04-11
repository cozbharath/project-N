package com.arrays;

public class D2array {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[0][0] = 101;
		arr[0][1] = 102;
		arr[0][2] = 103;

		arr[1][0] = 104;
		arr[1][1] = 105;
		arr[1][2] = 106;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}

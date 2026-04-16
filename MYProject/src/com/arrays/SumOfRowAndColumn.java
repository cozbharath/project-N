package com.arrays;

public class SumOfRowAndColumn {

	public static void main(String[] args) {
		
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			int sumRow1 = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sumRow1 += arr[i][j];
			}
			
			System.out.println("Sum of Rows " + i + " = " +sumRow1);
		}
		System.out.println();
		
		for (int j = 0; j < arr.length; j++) {
			int sumColumn = 0;
			for (int i = 0; i < arr[j].length; i++) {
				sumColumn += arr[i][j];
			}
			
			System.out.println("Sum of Columns " +  j  + " = " +sumColumn);
		}
	}

}

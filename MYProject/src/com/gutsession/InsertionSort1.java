package com.gutsession;

public class InsertionSort1 {

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6 };
		isInsertion(arr);

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void isInsertion(int[] arr) {
		int temp = 0, j = 0;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
	}

}

package com.gutsession;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };

		isSort(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void isSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

	}

}

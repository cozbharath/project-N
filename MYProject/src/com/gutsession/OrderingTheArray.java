package com.gutsession;

public class OrderingTheArray {

	public static void main(String[] args) {
		int[] arr = { -1, 1, -1, 3, 12 };
		int temp = 0;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for (int ar : arr) {
			System.out.print(ar + " ");
		}
	}

}

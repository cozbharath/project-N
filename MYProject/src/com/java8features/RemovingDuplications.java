package com.java8features;

public class RemovingDuplications {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 5, 6, 6, 7, 8, 9, 9 };
		int i = 0;
		int length = 1;
		for (int j = 0; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				length++;
				i++;
				arr[i] = arr[j];

			}
		}
		for (int k = 0; k < length; k++) {
			System.out.print(arr[k] + " ");

		}
		System.out.println();
		System.out.println("Length : " + length);

	}

}

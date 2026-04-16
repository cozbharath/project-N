package com.arrays;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}

package com.gutsession;

public class GreaterNeighbore {
	public static void main(String[] args) {

		int[] arr = { 1, 3, 20, 4, 1, 0 };
		if (arr[0] > arr[1]) {
			System.out.println(arr[0]);
		}
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.println(arr[i]);
			}
		}
		if (arr[arr.length - 1] > arr[arr.length - 2]) {
			System.out.println(arr[arr.length - 1]);
		}

	}
}

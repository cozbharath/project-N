package com.gutsession;

public class AssendingOrder {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		boolean status = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				status = false;
				break;
			}

		}
		System.out.println(status);

	}

}

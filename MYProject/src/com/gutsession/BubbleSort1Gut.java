package com.gutsession;

public class BubbleSort1Gut {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 4, 2 };

		isBubbleSort(arr);
//		int temp = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void isBubbleSort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}

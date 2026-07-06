package com.gutsession;

public class SecondLargetNumber {

	public static void main(String[] args) {
		int[] arr = { 12, 45, 67, 23, 89, 54, 90, 100 };
		System.out.println(isSecondLargest(arr));

	}

	public static int isSecondLargest(int[] arr) {
		int fLargest = Integer.MIN_VALUE;
		int sLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > fLargest) {
				sLargest = fLargest;
				fLargest = arr[i];
			} else if (arr[i] > sLargest && arr[i] != fLargest) {
				sLargest = arr[i];
			}
		}
		return sLargest;
	}

}

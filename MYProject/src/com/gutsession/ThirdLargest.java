package com.gutsession;

public class ThirdLargest {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20};
		int flargest = Integer.MIN_VALUE;
		int slargest = Integer.MIN_VALUE;
		int tlargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > flargest) {
				tlargest = slargest;
				slargest = flargest;
				flargest = arr[i];
			} else if (arr[i] > slargest && arr[i] != flargest) {
				tlargest = slargest;
				slargest = arr[i];
			} else if (arr[i] > tlargest && arr[i] != slargest && arr[i] != flargest) {
				tlargest = arr[i];
			}
		}
		System.out.println("Third Largest " + tlargest);
		System.out.println("Second Largest " + slargest);
		System.out.println("First Largest " + flargest);
	}

}

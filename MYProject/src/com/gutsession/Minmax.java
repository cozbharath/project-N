package com.gutsession;

public class Minmax {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			System.out.print(arr[j] + " " + arr[i] + " ");
			i++;
			j--;
		}

		if (i == j) {
			System.out.print(arr[i]);
		}

	}

}

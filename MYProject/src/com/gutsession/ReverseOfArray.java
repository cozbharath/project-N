 package com.gutsession;

public class ReverseOfArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int temp, i = 0;
		int j = arr.length - 1;
		while (arr[i] < arr[j]) {
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}

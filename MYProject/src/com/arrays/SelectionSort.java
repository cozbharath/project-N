package com.arrays;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
//		int[] arr = { 45, 18, 8, 7, 4, 1 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int temp = 0;
		System.out.println("Enter the values in Array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;

		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}

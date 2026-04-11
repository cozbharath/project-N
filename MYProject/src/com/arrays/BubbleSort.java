package com.arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
//		int[] arr = { 10, 50, 40, 30, 2, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int temp = 0;
		System.out.println("Enter Numbers In an Array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}

package com.arrays;

import java.util.Scanner;

public class CircularArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		int[] b = new int[size];

		System.out.println("Enter the values");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			b[i] = -1;
			for (int j = 1; j < size; j++) {
				int k = (i + j) % size;
				if (arr[k] > arr[i]) {
					b[i] = arr[k];
					break;
				}
			}
		}

		for (int f : b) {
			System.out.print(f + " ");
		}
	}

}

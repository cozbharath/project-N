package com.arrays;

import java.util.Scanner;

public class ReverseNumberArray {
	public static void ReverseNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			int n = arr[i];
			while (n != 0) {
				int d = n % 10;
				temp = temp * 10 + d;
				n = n / 10;

			}
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Vaules in an Array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		ReverseNumber(arr);
		
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}

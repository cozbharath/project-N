package com.arrays;

import java.util.Scanner;

public class RotationOfArray {

	public static void arrayReverse(int[] arr, int start, int end) {
		int temp = 0;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void arrayRotation(int[] arr, int r) {
		int start = 0;
		int end = arr.length - 1;
//		Reverse of an array
		arrayReverse(arr, start, end);

//		Reverse of 1stHalf
		arrayReverse(arr, start, r - 1);

//		Reverse of second hale
		arrayReverse(arr, r, end);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.Of array Rotations");
//		int[] arr = { 10, 20, 45, 55, 70, 90 };
		int r = sc.nextInt();
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values of an Array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		arrayRotation(arr, r);

//		print Rotation Array
		for (int a : arr) {
			System.out.print(a + " ");
		}
		sc.close();
	}

}

package com.collections;

import java.util.Scanner;

public class SlidingWindow1 {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Size");
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		System.out.println("Enter the Values : ");
		int num = 3;
		int windowSum = 0;
//		for (int i = 0; i < size; i++) {
//			arr[i] = sc.nextInt();
//		}

		for (int i = 0; i < num; i++) {
			windowSum += arr[i];
		}

		for (int i = 1; i < arr.length - num; i++) {
			windowSum = windowSum - arr[i - 1] + arr[i + num - 1];

		}
		System.out.println("Window Sum : " + windowSum);
	}

}

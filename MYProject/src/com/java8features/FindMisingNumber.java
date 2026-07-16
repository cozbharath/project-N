package com.java8features;

public class FindMisingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		int arrSum = 0;
		int sum = 0;
		int missingNumber = 0;
		for (int i = 1; i <= arr.length + 1; i++) {
			sum += i;
		}
		for (int a : arr) {
			arrSum += a;
		}
		missingNumber = sum - arrSum;
		System.out.println("Missing Number is: " + missingNumber);
	}

}

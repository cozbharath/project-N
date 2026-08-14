//package com.arrays;
//
//public class MissingNumber {
//
//	public static void main(String[] args) {
//		int[] arr = { 1, 2, 4, 5 };
//		int n = arr.length + 1;
//		int totalSum = n * (n + 1) / 2;
//		int arrSum = 0;
//		int missingNumber = 0;
//		for (int i = 0; i < arr.length; i++) {
//			arrSum = arrSum + arr[i];
//		}
//		missingNumber = totalSum - arrSum;
//		System.out.println(missingNumber);
//	}
//
//}

package com.arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5 };
		int arrSum = 0;
		int sum = 0;
		int missingNumber = 0;
		for (int i = 0; i <= 5; i++) {
			sum += i;
		}
		for (int a : arr) {
			arrSum += a;
		}
		System.out.println(sum);
		missingNumber = sum - arrSum;
		System.out.println(missingNumber);
	}
}

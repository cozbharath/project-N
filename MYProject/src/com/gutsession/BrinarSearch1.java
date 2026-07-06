package com.gutsession;

public class BrinarSearch1 {

	public static void main(String[] args) {
		int[] arr = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int target = 100;
		System.out.println(isSearch(arr, target));
	}

	public static int isSearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}

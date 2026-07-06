package com.gutsession;

public class FindTargetElement {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int target = 60;
		System.out.println(isTarget(arr, target));

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == target) {
//				System.out.println(i);
//			}
//		}
	}

	public static int isTarget(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}

		}
		return -1;
	}

}

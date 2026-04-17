package com.arrays;

public class ReverseOfArray {

	public static void main(String[] args) {
		int[] num = { 5, 6, 7, 8, 9 };
		for (int i = num.length-1; i >= 0; i--) {
			System.out.print(num[i] +" ");
		}
//		int[] rev = new int[num.length];
//		int i = num.length - 1;
//		for (int num1 : num) {
//			rev[i--] = num1;
//		}
//		for (int num1 : rev) {
//			System.out.print(num1 + " ");
//		}
	}
}

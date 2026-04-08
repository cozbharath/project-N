package com.arrays;

public class EvenOdd {

	public static void main(String[] args) {
		int[] arr = { 10, 15, 20, 25, 30 };
		for (int i : arr) {
			if (i % 2 == 0) {
				System.out.print(i +" ");
			}
		}
		System.out.println(" ");
		for (int i : arr) {
			if (i % 2 != 0) {
				System.out.print(i +" ");
			}
		}
	}

}

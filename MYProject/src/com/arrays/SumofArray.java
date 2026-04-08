package com.arrays;

public class SumofArray {

	public static void main(String[] args) {
		int[] num = { 2, 4, 4, 6 };
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			avg = sum / num.length;
		}
		System.out.println("sum of Array is : " + sum);
		System.out.println("Average of a Array is :" + avg);
	}

}

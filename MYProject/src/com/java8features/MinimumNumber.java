package com.java8features;

interface Minimum {
	int min(int a, int b);
}

public class MinimumNumber {
	public static void main(String[] args) {
		Minimum min = (a, b) -> a < b ? a : b;
		System.out.println(min.min(20, 30));
	}
}

package com.java8features;

interface FindmaximumNumber {
	int max(int a, int b);
}

public class MaximumNumber {
	public static void main(String[] args) {
		FindmaximumNumber max = (a, b) -> a > b ? a : b;
		System.out.println(max.max(10, 20));
	}
}

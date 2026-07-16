package com.java8features;

@FunctionalInterface
interface Addition {
	int sum(int a, int b);
}

public class Programm2 {

	public static void main(String[] args) {
		Addition sum = (a, b) -> a + b;
		System.out.println(sum.sum(20, 40));
	}
}

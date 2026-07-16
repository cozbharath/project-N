package com.java8features;

@FunctionalInterface
interface Multiply {
	int mul(int a, int b);
}

public class Programm4 {

	public static void main(String[] args) {
		Multiply mul = (a, b) -> a * b;
		System.out.println(mul.mul(10, 5));
	}

}

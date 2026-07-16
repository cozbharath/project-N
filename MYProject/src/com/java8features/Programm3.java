package com.java8features;

@FunctionalInterface
interface Substraction {
	int sub(int a, int b);
}

public class Programm3 {

	public static void main(String[] args) {
		Substraction sub = (a, b) -> a - b;
		System.out.println(sub.sub(20, 30));
	}
}

package com.java8features;

@FunctionalInterface
interface division {
	int div(int a, int b);
}

public class Programm5 {

	public static void main(String[] args) {
		division div = (a, b) -> a / b;
		System.out.println(div.div(30, 3));
	}

}

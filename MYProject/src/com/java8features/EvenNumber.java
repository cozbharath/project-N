package com.java8features;

interface Even {
	String even(int a);
}

public class EvenNumber {
	public static void main(String[] args) {
		Even even = (a) -> a % 2 == 0 ? "Even" : "odd";
		System.out.println(even.even(51));

		String str = "Java Spring Java react Java Python Java";
		System.out.println(str.lastIndexOf("Java", 25));

	}
}

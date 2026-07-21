package com.java8features;

import java.util.function.Supplier;

public class Programm13 {

	public static void main(String[] args) {
		Supplier<Integer> s = () -> {
			int a = 100;
			int b = 200;
			int mul = a * b;
			return mul;
		};

		System.out.println(s.get());
	}

}

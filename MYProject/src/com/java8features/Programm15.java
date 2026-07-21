package com.java8features;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Programm15 {

	public static void main(String[] args) {
		Function<Integer, String> f1 = (i) -> {
			String info = "";

			if (i > 18) {
				info = "Eligible";
			} else {
				info = "Not Eligible";
			}
			return info;
		};

		System.out.println(f1.apply(10));

		BiFunction<String, String, Integer> f2 = (s1, s2) -> s1.length() + s2.length();
		System.out.println(f2.apply("Java", "Simple"));
	}

}

package com.java8features;

import java.util.function.Predicate;

public class Programme3 {

	public static void main(String[] args) {
		Predicate<Integer> p = (i) -> i % 2 == 0;

		System.out.println(p.test(10));
		System.out.println("__________________________");

		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println(p1.and(p2).test(12));
		System.out.println(p1.and(p2).test(9));

		Predicate<String> p3 = s -> s.length() > 5;

		System.out.println(p3.test("OpenAI"));
	}

}

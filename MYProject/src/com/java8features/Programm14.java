package com.java8features;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Programm14 {
	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i % 2 == 0;
		System.out.println(p1.test(9));

		BiPredicate<Integer, Integer> p2 = (i1, i2) -> (i1 * i2) % 2 == 0;
		System.out.println(p2.test(10, 9));

		BiPredicate<String, String> p3 = (i2, i3) -> (i2.length() + i3.length() <= 15);
		System.out.println(p3.test("Nava", "Bharath"));
	}
}

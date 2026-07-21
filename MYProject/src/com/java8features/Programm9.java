package com.java8features;

import java.util.function.Predicate;

public class Programm9 {

	public static void main(String[] args) {
		String[] names = { "Axer Patel", "Washington", "Shubman Gill", "Sheryash", "Virat", "Rohit" };
		Predicate<String> p1 = (name) -> name.length() > 5;
		Predicate<String> p2 = (name) -> name.contains("h");
		Predicate<String> p3 = p1.or(p2).negate();
		for (String name : names) {
			if (p3.test(name)) {
				System.out.println(name);
			}
		}
	}

}

package com.java8features;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class AnagramTrue {

	public static void main(String[] args) {
		BiPredicate<String, String> str = (name1, name2) -> {
			char[] c1 = name1.toCharArray();
			char[] c2 = name2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		};

		if (str.test("listen", "silent")) {

			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
	}

}

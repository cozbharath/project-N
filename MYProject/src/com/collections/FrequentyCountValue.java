package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FrequentyCountValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		Map<Character, Integer> m = new HashMap<>();
		char[] ch = str.toCharArray();

		for (char c : ch) {
			m.put(c, m.getOrDefault(c, 0) + 1);
		}

		char maxChar = ' ';
		int count = 0;

		Set<Entry<Character, Integer>> ent = m.entrySet();

		for (Entry<Character, Integer> en : ent) {
			if (en.getValue() > count) {
				count = en.getValue();
				maxChar = en.getKey();
			}
		}

		System.out.println("Max Repated Char : " + maxChar);

		System.out.println("The Count Char : " + count);

	}

}

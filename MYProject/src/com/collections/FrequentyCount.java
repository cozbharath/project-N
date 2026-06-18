package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FrequentyCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		Map<Character, Integer> map = new HashMap<>();
		char[] ch = str.toCharArray();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		char maxChar = ' ';
		int count = 0;

		Set<Entry<Character, Integer>> entry = map.entrySet();

		for (Entry<Character, Integer> en : entry) {
			System.out.println(en.getKey() + " -> " + en.getValue());

		}

		for (Entry<Character, Integer> en : entry) {
			if (en.getValue() > count) {
				count = en.getValue();
				maxChar = en.getKey();
			}
		}

		System.out.println("Max Repated Char : " + maxChar);

		System.out.println("The Count Char : " + count);
	}

}

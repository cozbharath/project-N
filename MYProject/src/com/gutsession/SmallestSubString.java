package com.gutsession;

import java.util.HashSet;
import java.util.Set;

public class SmallestSubString {

	public static void main(String[] args) {
		String str = "aabcbcdbca";
		Set<Character> distinct = new HashSet<>();

		for (char ch : str.toCharArray()) {
			distinct.add(ch);
		}

		int totalDistinct = distinct.size();
		String smallest = "";

		for (int i = 0; i < str.length(); i++) {
			String smallestSub = "";
			Set<Character> temp = new HashSet<>();
			for (int j = i; j < str.length(); j++) {
				smallestSub += str.charAt(j);
				temp.add(str.charAt(j));
				if (temp.size() == totalDistinct) {

					if (smallest.isEmpty() || smallestSub.length() < smallest.length()) {
						smallest = smallestSub;
					}
					break;
				}
			}
		}

		System.out.println(smallest);

	}

}

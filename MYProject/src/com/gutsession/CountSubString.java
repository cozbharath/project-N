package com.gutsession;

import java.util.HashSet;
import java.util.Set;

public class CountSubString {

	public static void main(String[] args) {
		String str = "00110011";
		Set<Character> distinct = new HashSet<>();
		for (char ch : str.toCharArray()) {
			distinct.add(ch);
		}

		int totalDistinct = distinct.size();
		String smallest = "";

		for (int i = 0; i < str.length(); i++) {
			String current = "";
			Set<Character> temp = new HashSet<>();
			for (int j = i; j < str.length(); j++) {
				current += str.charAt(j);
				temp.add(str.charAt(j));
				if (temp.size() == totalDistinct) {

					if (smallest.isEmpty() || smallest.length() < smallest.length()) {
						smallest = current;
					}
					break;
				}
			}
		}
		System.out.println(smallest);
	}

}

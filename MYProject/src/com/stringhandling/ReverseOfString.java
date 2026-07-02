package com.stringhandling;

public class ReverseOfString {

	public static void main(String[] args) {
		String str = "I Love Vcube";

		String letter = str.replace(" ", "");
		StringBuilder rev = new StringBuilder(letter).reverse();
		StringBuilder result = new StringBuilder();
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				result.append(' ');
			} else {
				result.append(rev.charAt(j++));
			}
		}
		System.out.println(result);

	}

}

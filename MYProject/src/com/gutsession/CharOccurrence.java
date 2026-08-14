package com.gutsession;

public class CharOccurrence {

	public static void main(String[] args) {
		String str = "banana";
		char ch = 'a';

		char[] abs = str.toCharArray();

		int count = 0;

		for (char a : abs) {
			if (a == ch) {
				count++;
			}
		}
		System.out.println(count);

	}

}

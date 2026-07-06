package com.stringhandling;

public class EncondedString {

	public static void main(String[] args) {
		String str = "bcd";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'z') {
				result = result + 'a';
			} else {
				result = result + (char) (ch + 1);
			}
		}
		System.out.println(result);

	}

}

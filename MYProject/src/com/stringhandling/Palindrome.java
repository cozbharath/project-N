package com.stringhandling;

public class Palindrome {

	public static void main(String[] args) {
		String[] arr = { "madam", "hello", "civic" };

		for (String s : arr) {
			String rev = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				rev = rev + s.charAt(i);
			}

			if (s.equalsIgnoreCase(rev)) {
				System.out.println(s + "->" + "palindrome");
			}
		}

	}

}

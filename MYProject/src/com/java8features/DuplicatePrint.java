package com.java8features;

public class DuplicatePrint {

	public static void main(String[] args) {
		String str = "programming";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (str.indexOf(c) != str.lastIndexOf(c) && result.indexOf(c) == -1) {
				System.out.println(c);
				result = result + c;
			}
		}
	}

}

package com.stringhandling;

public class CaptialOfFirstLetter {

	public static void main(String[] args) {
		String str = "hello words";
		String[] words = str.split(" ");
		String result = "";
		for (String word : words) {
			result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		System.out.println(result.trim());
	}

}

package com.java8features;

public class GenerateSubsequences {

	public static void main(String[] args) {
		String str = "ABC";
		generatedSubSequence(str, "", 0);
	}

	private static void generatedSubSequence(String str, String string, int i) {

		if (i == str.length()) {
			System.out.print("\"" + string + "\"" + " ,");
			return;
		}

		generatedSubSequence(str, string + str.charAt(i), i + 1);
		generatedSubSequence(str, string, i + 1);
	}

}

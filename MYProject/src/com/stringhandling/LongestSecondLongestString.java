package com.stringhandling;

public class LongestSecondLongestString {

	public static void main(String[] args) {
		String str = "I love programming and debugging";
		String[] s = str.split(" ");
		String longestCount = "";
		String seconglongest = "";
		for (String word : s) {
			if (word.length() > longestCount.length()) {
				seconglongest = longestCount;
				longestCount = word;
			} else if (word.length() > seconglongest.length() && !word.equals(longestCount)) {
				seconglongest = word;
			}
		}
		System.out.println(longestCount.length() + "->" + longestCount);
		System.out.println(seconglongest.length() + "->" + seconglongest);
	}

}

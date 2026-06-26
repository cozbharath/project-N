package com.collections;

import java.util.HashSet;

public class LongestSubstring {

	public static void main(String[] args) {
		String str = "abcabcbb";
		HashSet<Character> set = new HashSet<>();

		int left = 0;
		int maxLength = 0;
		int start = 0;

		for (int right = 0; right < str.length(); right++) {

			while (set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}

			set.add(str.charAt(right));

			if (right - left + 1 > maxLength) {
				maxLength = right - left + 1;
				start = left;
			}
		}

		System.out.println("Longest Substring : " + str.substring(start, start + maxLength));

		System.out.println("Length : " + maxLength);
	}

}

package com.collections;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);
		int left = 0;
		int right = list.size() - 1;

		boolean result = true;
		while (left < right) {
			if (!list.get(left).equals(list.get(right))) {
				result = false;
				break;
			}

			left++;
			right--;
		}

		if (result) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}

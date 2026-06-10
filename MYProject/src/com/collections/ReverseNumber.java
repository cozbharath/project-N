package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseNumber {

	public static void ReverseNumber (List<Integer> list) {
		List<Integer> reverse = new ArrayList<>(list);

		Collections.reverse(reverse);

		if (list.equals(reverse)) {
			System.out.println("Palindrome List");
		} else {
			System.out.println("Not a Palindrome List");
		}

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);

		ReverseNumber(list);

	}

}

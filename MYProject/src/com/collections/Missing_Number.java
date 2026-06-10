package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Missing_Number {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(5);
		li.add(6);

		int n = 6;

		for (int i = 1; i < n; i++) {
			if (!li.contains(i)) {
				System.out.println(i);
			}
		}

	}

}

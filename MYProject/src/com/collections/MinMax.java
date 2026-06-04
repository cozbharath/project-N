package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class MinMax {

	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(25);
		c1.add(10);
		c1.add(45);
		c1.add(5);
		c1.add(30);

		for (Integer c : c1) {
			if (c < min) {
				min = c;
			}
			if (c > max) {
				max = c;
			}
		}
		System.out.println(min);
		System.out.println(max);

	}

}

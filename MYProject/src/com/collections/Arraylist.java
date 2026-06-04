package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Arraylist {

	public static void main(String[] args) {

		int count = 0;

		Collection<Integer> c1 = new ArrayList<>();
		c1.add(10);
		c1.add(15);
		c1.add(20);
		c1.add(25);
		c1.add(30);
		c1.add(35);

		for (Integer c : c1) {
			if (c % 2 != 0) {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count);

	}
}

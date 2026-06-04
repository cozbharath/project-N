package com.collections;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		int max = list.get(0);
		int smax = list.get(0);

		for (Integer l : list) {
			if (l > max) {
				smax = max;
				max = l;
			} else if (l > smax && l != max) {
				smax = l;
			}
		}
		System.out.println("Max Value : " + max);

		System.out.println("Second Max Value : " + smax);

	}

}

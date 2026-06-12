package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstNonRepeatElementIterator {

	public static void main(String[] args) {
		List<Integer> hs = new ArrayList<>();
		hs.add(10);
		hs.add(20);
		hs.add(40);
		hs.add(50);
		hs.add(70);
		hs.add(20);
		hs.add(10);

		Iterator<Integer> itr = hs.iterator();
		while (itr.hasNext()) {
			int value = itr.next();
			if (hs.indexOf(value) == hs.lastIndexOf(value)) {
				System.out.println(value);
				break;
			}
		}
	}
}

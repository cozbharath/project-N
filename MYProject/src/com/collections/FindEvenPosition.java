package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindEvenPosition {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		int index = 0;
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {

			int i = itr.next();

			if (index % 2 == 0) {
				System.out.println(0);
			} else {
				System.out.println(i);
			}
			index++;

		}
	}

}

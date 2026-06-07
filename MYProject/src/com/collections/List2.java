package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		System.out.println(list.size()); // 0
//		list.add(5, 10); // Exception in thread "main" java.lang.IndexOutOfBoundsException:
		list.add(10);
		list.add(20);
		list.add(30);
//		Iterator<Integer> itr = list.iterator();
//		while (itr.hasNext()) {
//			int i = itr.next();
//			if (i == 20) {
//				itr.remove();
//			}
//		}

		list.removeIf(i -> i == 20);
		System.out.println(list);
		System.out.println(list.size());
	}

}

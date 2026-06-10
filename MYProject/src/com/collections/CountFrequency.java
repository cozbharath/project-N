package com.collections;

import java.util.ArrayList;
import java.util.List;

public class CountFrequency {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(40);

		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			boolean status = false;

			for (int j = 0; j < i; j++) {
				if (list.get(i).equals(list.get(j))) {
					status = true;
					break;
				}
			}
			if (status) {
				continue;
			}

			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
				}
			}

			System.out.println(list.get(i) + "->" + (count));
		}
	}

}

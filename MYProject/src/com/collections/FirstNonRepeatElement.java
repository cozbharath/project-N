package com.collections;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatElement {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(50);

		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(list.get(i));
				break;
			}
		}
	}

}

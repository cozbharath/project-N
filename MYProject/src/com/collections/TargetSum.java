package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TargetSum {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(7);
		list.add(11);
		list.add(15);
		list.add(3);
		list.add(6);

		int n = 9;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				int temp = list.get(i) + list.get(j);
				if (temp == n) {
					System.out.println(list.get(i) + "," + list.get(j));
				}
			}
		}
	}

}

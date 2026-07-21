package com.collections;

import java.util.Arrays;
import java.util.List;

public class Practice2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		list.set(0, 100);

		int i = 0;
		int j = list.size() - 1;
		int temp = 0;
		while (i < j) {
			temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;
			j--;
		}

		System.out.println(list);

	}

}

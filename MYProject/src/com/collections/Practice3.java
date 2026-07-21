package com.collections;

import java.util.Arrays;
import java.util.List;

public class Practice3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		int r = 2;
		listRoatate(list, r);
		System.out.println(list);
	}

	public static void listRoatate(List<Integer> list, int r) {
		int start = 0;
		int end = list.size() - 1;

		listReverse(list, start, end);

		listReverse(list, r, end);

		listReverse(list, start, r - 1);
	}

	public static void listReverse(List<Integer> list, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);
			start++;
			end--;
		}

	}

}

package com.collections;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);

		int n = 6;
		int Sum = n * (n + 1) / 2;
		int sum1 = 0;
		for (Integer num : list) {
			sum1 += num;
		}

		int missing = Sum - sum1;
		System.out.println(missing);
	}

}

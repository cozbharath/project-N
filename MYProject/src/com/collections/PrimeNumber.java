package com.collections;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
	public static boolean isPrime(Integer l) {
		boolean status = true;
		if (l == 0 || l == 1) {
			status = false;
		}
		for (int i = 2; i < l; i++) {
			if (l % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		for (Integer l : list) {
			if (isPrime(l)) {
				System.out.println(l);
			}
		}
	}

}

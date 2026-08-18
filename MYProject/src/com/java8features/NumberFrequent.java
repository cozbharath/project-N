package com.java8features;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class NumberFrequent {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 1, 3, 1 };
		int k = 2;

		Map<Integer, Integer> map = new HashMap<>();

		for (int a : arr) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>((b, c) -> map.get(c) - map.get(b));
		pq.addAll(map.keySet());

		for (int i = 0; i < k; i++) {
			System.out.print(pq.poll() + " ");
		}

	}

}

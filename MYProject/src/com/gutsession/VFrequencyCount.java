package com.gutsession;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class VFrequencyCount {

	public static void main(String[] args) {
		String[] words = { "apple", "banana", "apple", "cherry", "banana", "apple" };
		int k = 2;

		Map<String, Integer> map = new HashMap<>();

		for (String word : words) {

			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 0);
			}
		}


		System.out.println(map);

		PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
		pq.addAll(map.keySet());

		for (int i = 0; i < k; i++) {
			System.out.print(pq.poll() + " ");
		}
	}

}

package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams1 {

	public static void main(String[] args) {

		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		Map<String, List<String>> map = new HashMap<>();

		for (String ar : arr) {
			char[] ch = ar.toCharArray();
			Arrays.sort(ch);

			String key = new String(ch);

			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}

			map.get(key).add(ar);
		}

		for (List<String> gp : map.values()) {
			System.out.println(gp);
		}
	}

}

	package com.gutsession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfWordsandGropus {

	public static void main(String[] args) {
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };

		Map<String, List<String>> map = new HashMap<>();

		for (String a : arr) {
			char[] ch = a.toCharArray();
			Arrays.sort(ch);

			String key = new String(ch);

			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}

			map.get(key).add(a);
		}

		for (List<String> g : map.values()) {
			System.out.println(g);
		}
	}

}

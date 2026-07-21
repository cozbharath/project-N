package com.collections;

import java.util.Arrays;
import java.util.List;

public class Practice1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 4, 2, 3, 5, 4, 6);

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

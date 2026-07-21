package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30));

		for (int i = 0; i < list.size(); i++) {
			boolean status = false;
			for (int j = 0; j < i; j++) {
				if (list.get(i).equals(list.get(j))) {
					status = true;
					break;
				}
			}

			if (status) {
				continue;
			}

			System.out.println(list.get(i));
		}
	}

}

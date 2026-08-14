package com.gutsession;

import java.util.Arrays;
import java.util.List;

public class ListFlattening {

	public static void main(String[] args) {

		List<Object> list = Arrays.asList(1, Arrays.asList(2, Arrays.asList(3, 4), 5), 6);

		flatten(list);
	}

	public static void flatten(List<Object> list) {

		for (Object obj : list) {

			if (obj instanceof List) {
				flatten((List<Object>) obj);
			} else {
				System.out.print(obj + " ");
			}
		}
	}

}

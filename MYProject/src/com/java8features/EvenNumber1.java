package com.java8features;

import java.util.Arrays;
import java.util.List;

public class EvenNumber1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer> list1 = list.stream().filter(i -> i % 2 == 0).toList();
		list1.forEach(System.out::println);
	}

}

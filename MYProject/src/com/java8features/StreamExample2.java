package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 7, 10, 17, 18, 33, 45, 47);
		List<Integer> l1 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l1);
	}

}

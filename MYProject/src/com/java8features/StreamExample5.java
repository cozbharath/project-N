package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample5 {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10, 15, 22, 31, 40, 55, 60);
		Stream<Integer> li1 = li.stream().filter(i -> i % 2 == 0);
		List<Integer> st = li1.collect(Collectors.toList());
		st.forEach(System.out::print );
	}

}

package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		l.add(17);
		l.add(18);
		l.add(19);
		l.add(20);

		System.out.println(l);
		Stream<Integer> s = l.stream();
		Stream<Integer> s1 = s.filter(i -> i % 2 == 0);
		List<Integer> l1 = s1.collect(Collectors.toList());
		System.out.println(l1);

	}

}

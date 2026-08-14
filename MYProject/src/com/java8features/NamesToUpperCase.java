package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesToUpperCase {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("nava", "bharath", "Kumar", "anil", "raju", "charan", "shoil");
		List<String> list1 = list.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());

		list1.forEach(i -> System.out.print(i + " "));
	}

}

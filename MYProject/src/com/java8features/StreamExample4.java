package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample4 {

	public static void main(String[] args) {
		List<Double> Sal = Arrays.asList(50000.00, 60000.00, 20000.00, 90000.00);
		List<Double> Sal1 = Sal.stream().map(d -> d + 5000.00).filter(i -> i > 50000.00).sorted()
				.collect(Collectors.toList());
		System.out.println(Sal1);

		List<String> names = Arrays.asList("Nava", "Bharath", "Kumar", "Raju", "Charan", "Kishor");
		List<String> na = names.stream().map(name -> name + "-JSF70-Vcube").collect(Collectors.toList());
		System.out.println(na);
		na.forEach(System.out::println);

	}

}

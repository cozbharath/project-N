package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample6 {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("Ravi", "Kumar", "Anil", "Raj", "Suresh", "Vijay");
		List<String> st = name.stream().filter(n -> n.length() > 4).collect(Collectors.toList());
		st.forEach(System.out::println);
		st.forEach(i -> System.out.print(i + " "));
	}

}

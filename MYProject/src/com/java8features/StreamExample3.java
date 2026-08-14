package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {

	public static void main(String[] args) {
		List<String> s = Arrays.asList("Kohli", "Rohit", "Sachin", "Rahul", "Abhishek");
		List<String> s1 = s.stream().filter(l -> l.contains("oh")).collect(Collectors.toList());
		System.out.println(s1);

	}

}

package com.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmailList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Navabharath@ghmail.com", "Raju@gmail.com", "Charan@gmail.com",
				"Kumar123@gmail.com", "Kumar");
		List<String> st = list.stream().filter(email -> email.contains("@") && email.endsWith(".com"))
				.collect(Collectors.toList());
		st.forEach(System.out::println);

	}

}

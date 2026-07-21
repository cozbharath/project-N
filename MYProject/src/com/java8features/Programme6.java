package com.java8features;

import java.util.function.Supplier;

public class Programme6 {

	public static void main(String[] args) {
		Supplier<String> su = () -> "Welcome to java";
		System.out.println(su.get());
	}

}

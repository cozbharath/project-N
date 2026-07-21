package com.java8features;

import java.util.function.Consumer;

public class Programme5 {

	public static void main(String[] args) {
		Consumer<String> name = n -> System.out.println(n.toUpperCase());
		name.accept("Srikanth");
	}

}

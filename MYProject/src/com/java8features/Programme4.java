package com.java8features;

import java.util.function.Function;

public class Programme4 {

	public static void main(String[] args) {
		Function<Integer, Integer> f = sal -> sal + (sal * 10 / 100);
		System.out.println(f.apply(50000));
	}

}

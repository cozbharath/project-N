package com.java8features;

import java.util.function.BiConsumer;

public class Programm16 {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> bic = (i1, i2) -> {
			System.out.println(i1 * i2);
			System.out.println(i1 * 10 * 100);
		};

		bic.accept(10, 20);
	}

}

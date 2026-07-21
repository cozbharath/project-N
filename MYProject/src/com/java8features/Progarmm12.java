package com.java8features;

import java.util.function.Supplier;

public class Progarmm12 {

	public static void main(String[] args) {

		System.out.println(Math.random() * 10);
		Supplier<String> s = () -> {
			String otp = "";

			for (int i = 0; i <= 5; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};

		System.out.println(s.get());
	}

}

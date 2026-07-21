package com.java8features;

import java.util.function.Supplier;

public class GenerateOtp {

	public static void main(String[] args) {

		Supplier<Integer> otp = () -> (int) (Math.random() * 900000) + 100000;

		System.out.println(otp.get());

		Supplier<String> su = () -> {
			String otp1 = "";
			for (int i = 1; i <= 6; i++) {
				otp1 = otp1 + (int) (Math.random() * 10);
			}
			return otp1;
		};
		System.out.println(su.get());

	}

}

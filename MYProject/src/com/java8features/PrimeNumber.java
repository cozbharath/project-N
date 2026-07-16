package com.java8features;

@FunctionalInterface
interface PrimeNumber1 {
	String prime(int a);
}

public class PrimeNumber {
	public static void main(String[] args) {
		PrimeNumber1 prime = (n) -> {

			if (n <= 1)
				return "Not Prime";

			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return "Not Prime";
			}

			return "Prime";
		};

		System.out.println(prime.prime(7));
	}
}

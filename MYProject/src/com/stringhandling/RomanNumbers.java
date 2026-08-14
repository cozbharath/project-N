package com.stringhandling;

public class RomanNumbers {

	public static void main(String[] args) {
		int number = 1994;

		System.out.println(convert(number));
	}

	static String convert(int num) {

		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < values.length; i++) {

			while (num >= values[i]) {

				sb.append(roman[i]);

				num -= values[i];
			}
		}
		return sb.toString();
	}
}

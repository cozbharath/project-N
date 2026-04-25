package com.patterns;

public class NumberPattern15 {

	public static void main(String[] args) {
		char c = 65;
		for (int i = 1; i <= 4; i++) {
			for (int j = i; j <= 4; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(c + " ");

			}
			c++;

			System.out.println();
		}
	}

}

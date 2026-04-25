package com.patterns;

public class NumberPattern17 {

	public static void main(String[] args) {
		char c = 'A';
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i <= j) {
					System.out.print("*");
				} else {
					System.out.print(c);
					c++;
				}
			}
			System.out.println();
		}
	}

}

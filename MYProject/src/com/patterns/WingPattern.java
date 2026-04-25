package com.patterns;

public class WingPattern {

	public static void main(String[] args) {
		int star = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if (i < 4) {
				star = star + 1;
			} else {
				star = star - 1;
			}
			System.out.println();

		}

	}

}

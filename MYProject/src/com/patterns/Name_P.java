package com.patterns;

public class Name_P {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j == 1 || (i == 1 && j <= 5) || (i == 4 && j <= 5) || (j == 5 && i != 1 && i < 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 5; j++) {
				if (i >= 2 && i <= 6 && j > 1 && j < 5) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 5; j++) {
				if (i >= 2 && i <= 6 && j > 1 && j < 5 && j != 5 || (i == 1 && j == 5) || (i == 7 && j == 5)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 7; j++) {
				if (i == 1 || i == 7 || j == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = 1; j <= 7; j++) {
				if (i == 7 || j == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j = i; j <= 7; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {

				if (j == 1 || j == (2 * i - 1) || i == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("______________________________________________________________________________");

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j == 1 || j == 7 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = i; j <= 7; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {

				if (j == 1 || j == (2 * i - 1) || i == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 7; j++) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 7; j >= 1; j--) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");

			for (int j = i; j <= 7; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (j == 1 || j == (2 * i - 1) || i == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("______________________________________________________________________________");

		for (int i = 1; i <= 7; i++) {

			for (int j = 1; j <= 6; j++) {
				if (j == 1 || (i == 1 && j <= 5) || (i == 4 && j <= 5) || (j == 5 && i != 1 && i < 4) || j == 1
						|| (i == 4 && j <= 5) || (i == 7 && j <= 5) || (j == 5 && i != 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 7; j++) {
				if (j == 1 || j == 7 || i == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = i; j <= 7; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (j == 1 || j == (2 * i - 1) || i == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for (int j = 1; j <= 6; j++) {
				if (j == 1 || (i == 1 && j < 5) || (i == 4 && j < 5) || (j == 5 && i > 1 && i < 4)
						|| (i - j == 2 && i >= 5)) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = i; j <= 7; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (j == 1 || j == (2 * i - 1) || i == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			for (int j = 1; j <= 7; j++) {
				if (i == 1 || j == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 7; j++) {
				if (j == 1 || j == 7 || i == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("______________________________________________________________________________");
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j == 1 || (i + j == 5) || (i - j == 3)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 7; j++) {
				if (j == 1 || j == 7 || i == 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 14; j++) {
				if (j == 1 || j == 14 || i == j && i <= 7 || i + j == 15 && i <= 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = i; j <= 7; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				if (j == 1 || j == (2 * i - 1) || i == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 6; j++) {
				if (j == 1 || (i == 1 && j < 5) || (i == 4 && j < 5) || (j == 5 && i > 1 && i < 4)
						|| (i - j == 2 && i >= 5)) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

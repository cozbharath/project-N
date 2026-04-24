package com.patterns;

public class DiamondPattern {

	public static void main(String[] args) {
		int star = 1, space = 4;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if (i < 5) {
				star = star + 2;
				space = space - 1;
			} else {
				star = star - 2;
				space = space + 1;
			}
			System.out.println();
		}
	}

}

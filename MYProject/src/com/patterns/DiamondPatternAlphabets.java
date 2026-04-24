package com.patterns;

public class DiamondPatternAlphabets {

	public static void main(String[] args) {
		char c = 65;
		int i, j, k, start = 1, spaces = 4;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= spaces; j++) {
				System.out.print("  ");
			}
			for (k = 1; k <= start; k++) {
				System.out.print(c +" ");
			}
			c++;
			if (i < 5) {
				start = start + 2;
				spaces = spaces - 1;
			} else {
				start = start - 2;
				spaces = spaces + 1;

			}
			System.out.println();
		}
	}

}

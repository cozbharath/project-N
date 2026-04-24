package com.patterns;

public class NamePattern {

	public static void main(String[] args) {
		String name = "BHARATH";
		char ch = 'A';
		int i, j;
		for (i = 1; i <= 7; i++) {
			for (j = 1; j <= 7; j++) {
				if (i == j || i + j == 8) {
					System.out.print(name.charAt(i - 1) + " ");
				} else {
					System.out.print(ch + " ");
					ch++;
					if (ch > 'Z')
						ch = 'A';
				}
			}
			System.out.println();
		}
	}

}

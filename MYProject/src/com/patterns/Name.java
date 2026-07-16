package com.patterns;

public class Name {
	public static void main(String[] args) {
		String name = "VIRAT";
		char ch = 'A';
		int i, j;
		for (i = 1; i <= name.length(); i++) {
			for (j = 1; j <= name.length(); j++) {
				if (i == j || i + j == 6) {
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

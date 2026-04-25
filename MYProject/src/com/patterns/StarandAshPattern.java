package com.patterns;

public class StarandAshPattern {

	public static void main(String[] args) {
		int space = 4, star = 1, ash = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= ash; j++) {
				System.out.print("#");
			}
			star = star + 1;
			space = space - 1;
			ash = ash + 1;
			System.out.println();
		}
	}

}

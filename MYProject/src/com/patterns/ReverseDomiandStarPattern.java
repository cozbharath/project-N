package com.patterns;

public class ReverseDomiandStarPattern {

	public static void main(String[] args) {
		int star = 1, spaces = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			star = star + 2;
			spaces = spaces - 1;
			System.out.println();
		}
	}

}

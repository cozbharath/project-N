package com.patterns;

public class NumberPattern5 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				count++;
				System.out.print(count +" ");
			}
			System.out.println();
		}
	}

}

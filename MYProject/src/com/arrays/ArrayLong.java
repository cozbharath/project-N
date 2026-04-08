package com.arrays;

public class ArrayLong {

	public static void main(String[] args) {
		long[] age = new long[10];

		age[0] = 20;
		age[1] = 27;
		age[2] = 23;
		age[3] = 22;
		age[4] = 24;
		age[5] = 21;
		age[6] = 30;
		age[7] = 10;
		age[8] = 19;
		age[9] = 18;

		for (long i = 0; i < age.length; i++) {
			System.out.print(age[(int) i] + " ");
		}
	}

}

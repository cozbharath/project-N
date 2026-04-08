package com.arrays;

public class ArrayFloat {

	public static void main(String[] args) {
		float[] age = new float[10];

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

		for (float i = 0; i < age.length; i++) {
			System.out.print(age[(int) i] + " ");
		}
	}

}

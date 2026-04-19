package com.loops;

public class LcmValue {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		int max = Math.max(a, b);
		while (true) {
			if (max % a == 0 && max % b == 0) {
				System.out.println("Lcm:" + max);
				break;
			}
			max++;
		}

	}

}

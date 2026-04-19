package com.loops;

public class GcdNumber {

	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		int a = 12;
		int b = 56;
		int gcdValue = gcd(a, b);
		int lcm = (a * b) / gcdValue;
		System.out.println("GCD Value is: " + gcdValue);
		System.out.println("LCM : " + lcm);
	}

}

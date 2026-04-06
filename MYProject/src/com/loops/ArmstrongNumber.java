package com.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;
		int temp = n;
		String s = Integer.toString(n);
		int count = s.length();
		while(n > 0) {
			r = n % 10;
			n = n / 10;
			sum = (int) (sum + Math.pow(r, count));
		}
		if(temp == sum) {
			System.out.println("Armstrong Number");
		} else {
		System.out.println("not Armstrong Number");
		}
	}

}

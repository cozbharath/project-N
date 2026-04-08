package com.loops;

import java.util.Scanner;

public class HappyNumberFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = num;
		int r = 0;
		for (; sum > 9;) {
			int temp = sum;
			sum = 0;
			for (; temp > 0; temp = temp / 10) {
				r = temp % 10;
				sum += Math.pow(r, 2);
			}
		}
		
		if(sum == 1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not Happy Number");
		}
	}

}

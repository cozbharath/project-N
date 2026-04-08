package com.loops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int s = n * n;
		int r = 0;
		int sum = 0;
		while(s !=0) {
			r = s% 10;
			sum = sum + r;
			s = s/10;
		}
		if(sum == n) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not Neon Number");
		}
		sc.close();
	}

}

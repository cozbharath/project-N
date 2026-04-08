package com.loops;

import java.util.Scanner;

public class FactorialNumber {
	
	static int isFact(int n) {
		if(n==1) {
			return 1;
		}
		
		return n * isFact (n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int fact = isFact(n);
		System.out.println(fact);
		sc.close();
	}

}

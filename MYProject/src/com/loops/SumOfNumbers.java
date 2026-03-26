package com.loops;

import java.util.Scanner;

public class SumOfNumbers {

	void getSumofNumbers(int num, int sum) {
		for(int i =0; i<=num;i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = sc.nextInt();
		int sum = 0;
		SumOfNumbers s = new SumOfNumbers();
		s.getSumofNumbers(num,sum);
		sc.close();
	}

}

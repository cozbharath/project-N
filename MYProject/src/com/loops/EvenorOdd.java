package com.loops;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number  : ");
		int num = sc.nextInt();
		while (num <= 50) {
			if (num % 2 == 0) {
				System.out.println("Even Numbers" + num);	
			}
			else {
				System.out.println("Odd Numbers" + num);
			}
			num++;
		}
	}

}

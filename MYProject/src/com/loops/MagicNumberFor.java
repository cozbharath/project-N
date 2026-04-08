package com.loops;

import java.util.Scanner;

public class MagicNumberFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Digit");
		int num = sc.nextInt();
		int sum = num;
		
		for(; sum >= 9;) {
			int temp = sum;
			sum = 0;
			for(; temp > 0; temp = temp / 10) {
				int r = temp % 10;
				sum = sum + r;
			}
		}
		if(sum==1) {
			System.out.println("Magic Number");
		} else {
			System.out.println("Not Magic Number");
		}
		sc.close();
	}

}

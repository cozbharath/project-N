package com.loops;

import java.util.Scanner;

public class CounttDigitFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Digit : ");
		int n = sc.nextInt();
		int count = 0;
		for (; n != 0; n = n / 10) {
            count++;
        }
		if(count == 0) {
			count = 1;
		}
		System.out.println(count);
		sc.close();
	}

}

package com.myproject;

public class IncrementDec {

	public static void main(String[] args) {
		int x = 3;
		int y = x << 2 + 1;
		
		int a = 8;
		int b = 2;
		int c = a >> b << 1;
		
		int m = 5;
		int n = (m > 3) ? m++ : ++m;
		System.out.println(m + " " + n);
		
		System.out.println(y);
		System.out.println(c);
		System.out.println(1 << 2 << 3);
		
	
	}

}

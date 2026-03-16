package com.myproject;

public class UniaryOp {

	public static void main(String[] args) {
		int a = 0;
		System.out.println(a++ + ++a - ++a + --a - a-- + a++ + ++a);
		System.out.println(a);
		System.out.println("****************");
		
		int x = 1;
		int y = 1;
		
		System.out.println(x++ - --y + x++ * ++y + --y - --x + x++ + y++);
		System.out.println(x);
		System.out.println(y);
		System.out.println("****************");
		
		int b = 1;
		int c = 1;
		int z = -2;
		
		System.out.println((b++ * c++) - z-- + (c * b--) - (--z * c));
		System.out.println(b);
		System.out.println(c);
		System.out.println(z);
		
	}

}

package com.stringhandling;

public class String3 {

	public static void main(String[] args) {
		String str = "Java";
		System.out.println(str.codePointAt(2));
		System.out.println(str.codePointBefore(1));

		byte b = 10;
		b += 20;
		System.out.println(b);
	}

}

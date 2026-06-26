package com.stringhandling;

public class String2 {

	public static void main(String[] args) {
		String str = "abc";

		char[] ch = { 'a', 'b', 'c' };
		String str1 = new String(ch);
		System.out.println(ch);
		System.out.println(str1);
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println("********************************");

		String s1 = new String();
		System.out.println(s1);

		System.out.println("***************************************");
	}

}

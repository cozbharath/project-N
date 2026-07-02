package com.stringhandling;

public class TestStringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sd = new StringBuffer();
		sd.append("Srikanth");
		sd.reverse();

		System.out.println(sd.length());
		System.out.println(sd.capacity());
		System.out.println(sd);

		Integer x = null;

		System.out.println(x + 10);
	}

}

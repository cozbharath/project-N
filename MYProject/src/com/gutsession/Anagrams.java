package com.gutsession;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		String str1 = "ab";
		String str2 = "bc";

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		boolean status = false;
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			status = true;
		}
//
//		byte[] b1 = str1.getBytes();
//		byte[] b2 = str1.getBytes();
//		int sum1 = 0;
//		int sum2 = 0;
//
//		for (int i = 0; i < b1.length; i++) {
//			sum1 += b1[i];
//		}
//		for (int i = 0; i < b2.length; i++) {
//			sum1 += b2[i];
//		}
//
//		if (sum1 == sum2) {
//			status = true;
//		}
//
//		System.out.println("1" + status);
		System.out.println(status);
	}

	public static void main1(String[] args) {

	}

}

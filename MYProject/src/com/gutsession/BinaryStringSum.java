package com.gutsession;

public class BinaryStringSum {

	public static void main(String[] args) {
		String s1 = "11";
		String s2 = "1";
		String s3 = "1";
		System.out.println(addBinary(s1, s2, s3));
	}

	private static String addBinary(String s1, String s2, String s3) {

		StringBuilder sb = new StringBuilder();
		int i = s1.length() - 1;
		int j = s2.length() - 1;
		int k = s3.length() - 1;
		int carry = 0;
		while (i >= 0 || j >= 0 || k >= 0 || carry == 1) {
			int sum = carry;
			if (i >= 0) {
				sum = sum + s1.charAt(i) - '0';
				i--;
			}

			if (j >= 0) {
				sum = sum + s2.charAt(j) - '0';
				j--;
			}

			if (k >= 0) {
				sum = sum + s3.charAt(k) - '0';
				k--;
			}

			sb.append(sum % 2);
			carry = sum / 2;
		}
		return sb.reverse().toString();

	}

}

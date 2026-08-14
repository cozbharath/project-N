package com.gutsession;

public class ReverseStringPreserveSpac {

	public static void main(String[] args) {
		String str = "Java    Full    Stack";
		String[] ch = str.split(" ");

		for (String c : ch) {
			String rev = "";
			for (int i = c.length() - 1; i >= 0; i--) {

				rev = rev + c.charAt(i);
			}
			System.out.print(rev + " ");
		}
	}

}

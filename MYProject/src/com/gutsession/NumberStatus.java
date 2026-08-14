package com.gutsession;

public class NumberStatus {

	public static void main(String[] args) {
		String str = "12q345";
		boolean status = true;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				status = false;
				break;
			}
		}
		System.out.println(status);
	}
}

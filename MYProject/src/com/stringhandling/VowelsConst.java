package com.stringhandling;

public class VowelsConst {

	public static void main(String[] args) {
		String s = "abc@123".toUpperCase();
		int vol = 0;
		int cont = 0;
		int special = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
					|| s.charAt(i) == 'U') {
				vol++;
			} else if (Character.isLetter(s.charAt(i))) {
				cont++;
			} else {
				special++;
			}
		}

		System.out.println("Vowels: " + vol);
		System.out.println("Consonants: " + cont);
		System.out.println("Special Characters: " + special);
	}

}

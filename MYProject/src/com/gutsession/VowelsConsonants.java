package com.gutsession;

public class VowelsConsonants {

	public static void main(String[] args) {
		String str = "programming".toUpperCase();

		int vcount = 0;
		int ccount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U') {
				vcount++;
			} else if (Character.isLetter(str.charAt(i))) {
				ccount++;
			}
		}

		System.out.println("Vowel Count :" + vcount);

		System.out.println("Consonants Count :" + ccount);
	}

}

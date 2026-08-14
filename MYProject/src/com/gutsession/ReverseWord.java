package com.gutsession;

public class ReverseWord {

	public static void main(String[] args) {
		String str = "Java Full Stack";
		StringBuilder word = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				word.append(str.charAt(i));
			} else {
				System.out.print(word.reverse() + " ");
				word.setLength(0);
			}
		}
		System.out.println(word.reverse());
	}

}

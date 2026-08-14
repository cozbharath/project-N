package com.gutsession;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "Java Full Stack";
		String[] word = str.trim().split("\\s+");
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i] + " ");
		}
	}

}

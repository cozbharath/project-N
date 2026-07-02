package com.stringhandling;

public class ArrangePriority {

	public static void main(String[] args) {
		String str = "going4 to3 Hyderabad5 I1 am2";
		String result = "";
		String[] words = str.split(" ");
		int n = 1;
		for (int i = 0; i < words.length; i++) {

			for (String word : words) {
				int num = Integer.parseInt(word.substring(word.length() - 1));
				if (n == num) {
					result = result + word.subSequence(0, word.length() - 1) + " ";
					n++;
				}
			}
		}
		System.out.println(result);
	}

}

package com.gutsession;

public class PatternIndex {

	public static void main(String[] args) {
		String str = "AABAACAADAABAABA";
		String pattern = "AABA";
		int index = str.indexOf(pattern);
		while (index != -1) {
			System.out.print(index + " 	");
			index = str.indexOf(pattern, index + 1);
		}
	}

}

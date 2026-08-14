package com.gutsession;

public class LongestString {

	public static void main(String[] args) {
		String str = "In Vcube!!, Java is simple to";
		String[] ch = str.replaceAll("[^a-zA-Z0-9]", " ").split("\\s+");
		String maxEl = "";
		for (String c : ch) {
			if (c.length() > maxEl.length()) {
				maxEl = c;
			}
		}
		System.out.println(maxEl);
	}

}

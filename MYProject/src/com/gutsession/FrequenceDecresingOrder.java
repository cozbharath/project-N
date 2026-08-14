package com.gutsession;

public class FrequenceDecresingOrder {

	public static void main(String[] args) {
		String str = "bbbaaacc";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (result.indexOf(c) == -1) {
				int count = 0;
				for (int j = 0; j < str.length(); j++) {
					if (c == str.charAt(j)) {
						count++;
					}
				}

				System.out.print(c);
				result = result + c;
			}
		}

	}

}

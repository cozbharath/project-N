package com.gutsession;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
//		String str = "  Java Full            Stack   Developer  " ;
//		String[] s = str.trim().split("\\s+");
//		int count = 0;
//		for (String s1 : s) {
//			count++;
//      	System.out.println(s1);
//			
//			 = 
//		}
//
//		System.out.println(count);

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the words : ");
		String s = sc.nextLine();
		// String[] str = s.split(" ");
		// System.out.println("Count of words :"+ str.length);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if ((s.charAt(i) != ' ') && (i == 0 || s.charAt(i - 1) == ' ')) {

				count++;
			}

		}
		System.out.println(count);

	}

}

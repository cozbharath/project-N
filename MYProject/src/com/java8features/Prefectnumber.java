package com.java8features;

interface Prefect {
	String pref(int a);
}

public class Prefectnumber {
	public static void main(String[] args) {

		Prefect pref = (a) -> {
			int sum = 0;
			for (int i = 1; i <= a / 2; i++) {
				if (a % i == 0) {
					sum = sum + i;
				}
			}
			return (sum == a) ? "Prefect Number" : "Not Prefect Number";
		};
		System.out.println(pref.pref(6));
	}
}

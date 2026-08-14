package com.gutsession;

import java.util.HashSet;
import java.util.Set;

public class MergeSortedArrayCommmonElements {

	public static void main(String[] args) {
		int[] A = { 1, 5, 10 };
		int[] B = { 1, 4, 10 };
		int[] C = { 1, 6, 10 };

		Set<Integer> set = new HashSet<>();

		for (int a : A) {
			set.add(a);
		}

		Set<Integer> setB = new HashSet<>();

		for (int a : B) {
			setB.add(a);
		}

		set.retainAll(setB);

		Set<Integer> setc = new HashSet<>();

		for (int a : C) {
			setc.add(a);
		}

		set.retainAll(setc);

		System.out.println(set);
	}

}

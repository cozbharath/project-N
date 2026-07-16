package com.gutsession;

import java.util.HashSet;

public class RemovingDuplicatesUsihHashSet {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 30, 20, 40, 50 };
		HashSet<Integer> hs = new HashSet<>();
		for (int n : arr) {
			if (!hs.contains(n)) {
				hs.add(n);
				System.out.print(n + " ");
			}
		}

	}
}

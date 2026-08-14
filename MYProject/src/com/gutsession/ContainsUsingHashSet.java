package com.gutsession;

import java.util.HashSet;
import java.util.Set;

public class ContainsUsingHashSet {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4 };
		int[] B = { 2, 3, 5 };

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}

		boolean status = true;

		for (int i = 0; i < B.length; i++) {
			if (!set.contains(B[i])) {
				status = false;
				break;
			}
		}

		System.out.println(status);

	}

}

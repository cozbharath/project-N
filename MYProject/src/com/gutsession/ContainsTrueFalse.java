package com.gutsession;

import java.util.ArrayList;
import java.util.List;

public class ContainsTrueFalse {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4 };
		int[] B = { 2, 3};

		List<Integer> list1 = new ArrayList<>();

		for (int i = 0; i < A.length; i++) {
			list1.add(A[i]);
		}
		boolean status = true;

		for (int i = 0; i < B.length; i++) {
			if (!list1.contains(B[i])) {
				status = false;
				break;
			}

		}

		System.out.println(status);
	}

}

package com.gutsession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreatestElements {

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		int max = Integer.MIN_VALUE;
		List<Integer> li = new ArrayList<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				li.add(max);
			}
		}
		Collections.reverse(li);
		System.out.println(li);
	}

}

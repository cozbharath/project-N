package com.collections;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		Set<Integer> st = new HashSet<>();

		st.add(10);
		st.add(20);
		st.add(30);
		st.add(40);
		st.add(50);

		Set<Integer> st1 = new HashSet<>();
		st1.add(30);
		st1.add(50);
		st1.add(40);
		st1.add(60);
		st1.add(70);

		Set<Integer> st3 = new HashSet<>(st);

		st3.retainAll(st1);

		for (Integer li : st3) {
			System.out.println(li);
		}
	}

}

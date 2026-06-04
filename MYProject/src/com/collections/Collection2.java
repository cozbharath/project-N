package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {

	public static void main(String[] args) {
		Collection<String> bowler = new ArrayList<>();
		bowler.add("bhumrah");
		bowler.add("Siraj");
		bowler.add("Kuldeep");
		bowler.add("Arashdeep");

		System.out.println(bowler);

		Collection<String> batsmens = new ArrayList<>();
		batsmens.add("Rohit Sharma");
		batsmens.add("Iyer");
		batsmens.add("Abshik");
		batsmens.add("Surya");

		System.out.println(batsmens);

		Collection<String> allrounders = new ArrayList<>();
		allrounders.add("Hardik Pandya");
		allrounders.add("Jedaja");

		System.out.println(allrounders);

		Collection<String> indian = new ArrayList<>();
		indian.addAll(batsmens);
		indian.addAll(allrounders);
		indian.addAll(bowler);
		System.out.println(indian);

		bowler.clear();
		System.out.println(bowler);
		System.out.println(batsmens.contains("Nava Bharath"));
		System.out.println(batsmens.contains("Iyer"));
		System.out.println(indian.containsAll(bowler));
	}

}

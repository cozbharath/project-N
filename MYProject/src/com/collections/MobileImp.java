package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MobileImp {

	public static void main(String[] args) {

		Mobile m1 = new Mobile("S21", "Samsung", 50000);
		Mobile m2 = new Mobile("s30", "Samsung", 600000);
		Mobile m3 = new Mobile("s1pro", "Samsung", 700000);
		Mobile m4 = new Mobile("A50", "Samsung", 150000);
		Mobile m5 = new Mobile("A51", "Samsung", 3000000);

		List<Mobile> moblist = new ArrayList<>();

		moblist.add(m1);
		moblist.add(m2);
		moblist.add(m3);
		moblist.add(m4);
		moblist.add(m5);
		
		Comparator<Mobile> m = new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				if(o1.price<o2.price) {
					return -1;
				} else if(o1.price>o2.price) {
					return 1;
				} else {
					return 0;
				}
			}
			
		};
		Collections.sort(moblist, m);
		
		for(Mobile e:moblist) {
			System.out.println(e);
		}
	}

}

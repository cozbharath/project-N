package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Nava", 9912955150L, 22, 100000.0);
		Employee e2 = new Employee(2, "Kumar", 9912953140L, 24, 120000.0);
		Employee e3 = new Employee(4, "Bharath", 9912115150L, 25, 140000.0);
		Employee e4 = new Employee(9, "Podila", 9912995150L, 23, 100000.0);
		Employee e5 = new Employee(5, "Swamy", 8112955150L, 26, 150000.0);

		List<Employee> empList = new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		Collections.sort(empList);
		for (Employee e : empList) {
			System.out.println(e);
		}
	}

}

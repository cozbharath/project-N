package com.connection.main;

import com.connection.DBOperations;
import com.connection.Student;

public class DBExample {

	public static void main(String[] args) {
		DBOperations db = new DBOperations();

		Student s = new Student();
		s.setStno(104);
		s.setStname("KumaraSwamy");
		s.setMarks(100);

//		db.insertStudent(s);
		db.selectStudent();
	}

}

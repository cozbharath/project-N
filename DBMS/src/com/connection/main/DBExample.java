package com.connection.main;

import com.connection.dao.DBOperations;
import com.connection.model.Student;

public class DBExample {

	public static void main(String[] args) {
		DBOperations db = new DBOperations();

		Student s = new Student();
		s.setStno(110);
		s.setStname("Nava  Bharath");
		s.setCourse("Java FullStack");
		s.setMarks(100);

//		db.insertStudent(s);
//		db.updateStudent(95, 102);
		db.selectStudent();
//		db.deleteStudent(101);
	}

}

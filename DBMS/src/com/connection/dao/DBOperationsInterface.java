package com.connection.dao;

import com.connection.model.Student;

public interface DBOperationsInterface {

	public void insertStudent(Student s);

	public void selectStudent();

	public void updateStudent(int id, int marks);

	public void deleteStudent(int id);

}
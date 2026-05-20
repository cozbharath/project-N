package com.connection.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.model.Student;
import com.connection.utility.DBConnection;

public class DBOperations {
	Connection con = null;

	public void insertStudent(Student s) {
		try {
			con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?,?)");

			ps.setInt(1, s.getStno());
			ps.setString(2, s.getStname());
			ps.setString(3, s.getCourse());
			ps.setInt(4, s.getMarks());

			int n = ps.executeUpdate();

			if (n > 0) {
				System.out.println(n + " row affected");
			} else {
				System.out.println("Something Wrong");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void selectStudent() {

		try {

			con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from students");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getInt(4));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updateStudent(int id, int marks) {

		try {

			con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("update students set marks=? where std_id=?");
			ps.setInt(1, id);
			ps.setInt(2, marks);

			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println("Student data updated Successfully");
			} else {
				System.out.println("Student not found");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deleteStudent(int id) {
		try {

			con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from students where std_id=?");
			ps.setInt(1, id);

			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println("Student data Deleted Successfully");
			} else {
				System.out.println("Student not found");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

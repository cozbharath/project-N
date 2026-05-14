package com.connection.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.DBConnection;
import com.connection.Student;

public class DBOperations {
	Connection con = null;
//	DBConnection db = null;

	public void insertStudent(Student s) {
		try {
			con = DBConnection.getConnection();

			PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?)");

			ps.setInt(1, s.getStno());
			ps.setString(2, s.getStname());
			ps.setInt(3, s.getMarks());

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
				System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

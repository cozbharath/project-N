package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBMSConnection {

	public static void main(String[] args) {

//		Loading Drivers

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

//			Connection

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connection", "root",
					"Bharath@8184");

//			Statement

			Statement st = con.createStatement();

//			Execute
			int n = st.executeUpdate("insert into students values(101,'Nava Bharath',100)");

			if (n > 0) {
				System.out.println(n + " row affected");
			} else {
				System.out.println("Something Wrong");
			}

		} catch (Exception e) {

			System.out.println(e);
		}
	}

}

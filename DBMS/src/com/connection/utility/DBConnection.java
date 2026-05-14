package com.connection.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con = null;

	public static Connection getConnection() {

//		Loading Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

//			Connection

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connection", "root", "Bharath@8184");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}

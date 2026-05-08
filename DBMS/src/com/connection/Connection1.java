package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connection1 {

	public static void main(String[] args) {

		try {
//			Loading Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			Connection

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connection", "root",
					"Bharath@8184");

//			Statement

//			String r = "insert into movies values(106,'Master',2000,'Vijay','Mavlika','Loki',curdate())";

			PreparedStatement ps = con.prepareStatement("select * from movies");
//			ps.executeUpdate();
			

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getInt(3) + " - " + rs.getString(4)
								+ " - " + rs.getString(5) + " - " + rs.getString(6) + " - " + rs.getTimestamp(7));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

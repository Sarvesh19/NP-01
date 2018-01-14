package com.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "sarvesh", "sarvesh");
			// here sonoo is the database name, root is the username and root is
			// the password
			Statement stmt = con.createStatement();

			
			ResultSet rs = stmt.executeQuery("select * from employee");

			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
						+ rs.getString(3));
			// System.out.println(null);
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

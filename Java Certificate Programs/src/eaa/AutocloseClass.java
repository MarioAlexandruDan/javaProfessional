package eaa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AutocloseClass {

	public static void main(String[] args) {

		String url = "";
		String uName = "";
		String pass = "";

		String query = "";

		try (Connection con = DriverManager.getConnection(url, uName, pass);
				PreparedStatement st = con.prepareStatement(query)) {

			System.out.print("Hello!");

		} catch (SQLException e) {

			e.printStackTrace();
//			java.sql.SQLException: No suitable driver found for 
//			at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:702)
//			at java.sql/java.sql.DriverManager.getConnection(DriverManager.java:228)
//			at eaa.AutocloseClass.main(AutocloseClass.java:18)
		}
	}
}

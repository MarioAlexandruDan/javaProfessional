package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/sqlwork";
		String uName = "root";
		String pass = "1231";

		try (Connection con = DriverManager.getConnection(url, uName, pass)) {

			System.out.print("The connection worked!"); // The connection worked!The connection worked!
		}
	}

}

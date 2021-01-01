package databaseConnection;

import java.sql.*;




public class DatabaseConnection {
	
	public static Connection getConnection() throws SQLException  {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = (Connection) DriverManager.getConnection("jdbc:sqlite:library.db");
			return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}

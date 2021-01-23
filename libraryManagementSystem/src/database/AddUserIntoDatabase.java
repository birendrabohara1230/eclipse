package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import dao.UserLoginDeclaration;
import databaseConnection.DatabaseConnection;


public class AddUserIntoDatabase {
	public boolean conform(UserLoginDeclaration obj) {
		Statement st = null;
		ResultSet rs = null;
		try {
			Connection con = DatabaseConnection.getConnection();
			String query = "select * from userlogindata where username = '"+obj.getUserName()+"' ";
		    st = con.createStatement();
		    rs = st.executeQuery(query);
			while(rs.next()) {
				if (obj.getUserName().equals(rs.getString("username")) && obj.getPassword().equals(rs.getString("password")))
				{
					return true;
				}
			}
			
		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, e);
		}
		finally {
			try {
				rs.close();
				st.close();
			} catch (Exception e2) {
				JOptionPane.showConfirmDialog(null, e2.toString());
			}
		}
		return false;
	}
}

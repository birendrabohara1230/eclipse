package updatebookinformation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import databaseConnection.DatabaseConnection;

public class SelectAllBook {
	
	public ResultSet selectAllBook() {
		Statement st = null;
		ResultSet rs = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String query = "select * from bookinformation";
			st = connection.createStatement();
			rs = st.executeQuery(query);
			return rs;
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, e);
		}
		finally {
			try {
				st.close();
				rs.close();
			} catch (Exception e2) {
				JOptionPane.showConfirmDialog(null, e2);
			}
		}
		return null;
	}
}

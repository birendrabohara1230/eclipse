package bookInformation;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import databaseConnection.DatabaseConnection;

public class AddBookInformationIntoDatabaseCode {
	
	public boolean addbookinformation(BookInformation addbook) {
		Statement st = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String  query = " insert into bookinformation values("+addbook.getBooknumber()+", '"+addbook.getBookname()+"', '"+addbook.getBookauthor()+"', '"+addbook.getDepartment()+"')";
			st = connection.createStatement();
			st.execute(query);
			connection.close();
			return true;
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, e.toString());
		}		
		return false;
	}
	
}

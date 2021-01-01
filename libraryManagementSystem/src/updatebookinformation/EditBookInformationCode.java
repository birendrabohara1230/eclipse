package updatebookinformation;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import bookInformation.BookInformation;
import databaseConnection.DatabaseConnection;

public class EditBookInformationCode {
	
	public boolean editbookinformation(BookInformation book) {
		Statement st = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String query = "update bookinformation set book_number = '"+book.getBooknumberchange()+"', book_name = '"+ book.getBookname()+"', author = '"+book.getBookauthor()+"', department = '"+book.getDepartment()+"' where book_number = '"+book.getBooknumber()+"'  ";
			st = connection.createStatement();
			st.execute(query);
			return true;
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, e);
		}
		finally {
			try {
				st.close();
			} catch (Exception e2) {
				JOptionPane.showConfirmDialog(null, e2);
			}
		}	
		return false;
	}
	
}

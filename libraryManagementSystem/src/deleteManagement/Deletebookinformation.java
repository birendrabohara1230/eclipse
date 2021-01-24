package deleteManagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import bookInformation.BookInformation;
import databaseConnection.DatabaseConnection;

public class Deletebookinformation {
		public boolean deletebookinformation(BookInformation book) throws SQLException {
			Statement st = null;
			Connection connection = DatabaseConnection.getConnection();
			try {
				String sql =  " delete from bookinformation where book_number = "+book.getBooknumber()+" ";
				st = connection.createStatement();
				st.execute(sql);
				connection.close();
				return true;
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, e.toString());
			}
			finally {
				try {
					st.close();
					connection.close();
				} catch (Exception e2) {
					JOptionPane.showConfirmDialog(null, e2.toString());
				}
			}
			return false;
		}
}

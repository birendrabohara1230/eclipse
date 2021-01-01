package deleteManagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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
				return true;
			} catch (Exception e) {
				// TODO: handle exception
			}
			finally {
				try {
					st.close();
					connection.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			return false;
		}
}

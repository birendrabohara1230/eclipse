package returnandhistorymanagement;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import bookInformation.BookInformation;
import databaseConnection.DatabaseConnection;

public class Returnbookbystudent {
		public boolean returnbook(BookInformation returnbook) {
			Statement  st = null;
			try {
				Connection connection = DatabaseConnection.getConnection();
				String sql = "delete from studentandbooknumber where book_number = "+returnbook.getBooknumber()+"";
				st = connection.createStatement();
				st.execute(sql);
				return true;
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, e.toString());
			}
			finally {
				try {
					st.close();
				} catch (Exception e2) {
					JOptionPane.showConfirmDialog(null, e2.toString());
				}
			}
			return false;
		}
}

package returnandhistorymanagement;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import bookInformation.BookInformation;
import dao.StudentInformation;
import databaseConnection.DatabaseConnection;

public class Historyofstudentandbookinformation {
		public boolean historyofstudent(StudentInformation historyofstudent, BookInformation historyofbook) {
			Statement  st = null;
			try {
				Connection connection = DatabaseConnection.getConnection();
				String sql = "insert into historyofstudentandbookinformation values("+historyofstudent.getStudentid()+", "+historyofbook.getBooknumber()+", date())";
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

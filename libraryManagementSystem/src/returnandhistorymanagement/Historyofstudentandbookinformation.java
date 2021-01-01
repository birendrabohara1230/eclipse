package returnandhistorymanagement;

import java.sql.Connection;
import java.sql.Statement;

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
				// TODO: handle exception
			}
			finally {
				try {
					st.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			return false;
		}
}

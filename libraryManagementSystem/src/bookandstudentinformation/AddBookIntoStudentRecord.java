package bookandstudentinformation;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import bookInformation.BookInformation;
import dao.StudentInformation;
import databaseConnection.DatabaseConnection;

public class AddBookIntoStudentRecord {
    public boolean addbookintostudentrecord(BookInformation book, StudentInformation student) {
    	Statement st =  null;
    	try {
			Connection connection = DatabaseConnection.getConnection();
			String sql = "insert into studentandbooknumber values('"+book.getBooknumber()+"', '"+student.getStudentid()+"', date())";
			       st  = connection.createStatement();
			       st.execute(sql);
			return true;
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, e.toString());
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

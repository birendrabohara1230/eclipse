package database;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import dao.StudentInformation;
import databaseConnection.DatabaseConnection;

public class DeleteStudentInformation {
	public boolean delete(StudentInformation information) {
		Statement st = null;
		try {	
			Connection con = DatabaseConnection.getConnection();
			String query = "delete from studentinformation where studentid = "+information.getStudentid()+"";
		    st = con.createStatement();
		    st.execute(query);
			return  true;		
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, e);
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

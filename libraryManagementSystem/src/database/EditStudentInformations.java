package database;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import dao.StudentInformation;
import databaseConnection.DatabaseConnection;

public class EditStudentInformations {
	public boolean update(StudentInformation student)
	{
		Statement st = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String query = " update studentinformation set studentid = '"+student.getStudentidfirst()+"', first_name = '"+student.getFirstname()+"' , last_name = '"+student.getLastname()+"' , father_name = '"+student.getFathername()+"' , mother_name = '"+student.getMothername()+"' ,  address = '"+student.getAddress()+"' , date_of_birth = '"+student.getDob()+"' , department = '"+student.getDepartment()+"' where studentid = "+student.getStudentid()+"";
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
				JOptionPane.showConfirmDialog(null, e2.toString());
			}
		}
		return false;
	}
}

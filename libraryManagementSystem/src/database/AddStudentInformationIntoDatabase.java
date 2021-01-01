package database;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;

import dao.StudentInformation;
import databaseConnection.DatabaseConnection;


public class AddStudentInformationIntoDatabase {
	
	public boolean add(StudentInformation student)
	{
		Statement st = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String query = "insert into studentinformation values ("+student.getStudentid()+", '"+student.getFirstname()+"','"+student.getLastname()+"','"+student.getFathername()+"','"+student.getMothername()+"','"+student.getAddress()+"','"+student.getDob()+"','"+student.getDepartment()+"')";
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

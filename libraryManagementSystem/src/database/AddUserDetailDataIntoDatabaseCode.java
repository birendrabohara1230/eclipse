/**
 * 
 */
package database;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import dao.AddUserDetailDataDeclaration;
import databaseConnection.DatabaseConnection;

/**
 * @author Birendra Bohara
 *
 */
public class AddUserDetailDataIntoDatabaseCode {
	public boolean insertDetailDataIntoDatabase(AddUserDetailDataDeclaration obj) {
		Statement st = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String query = "insert into userinformation values ("+obj.getUserid()+", '"+ obj.getFirstname() +"', '"+ obj.getLastname() +"', '"+ obj.getFathername() +"',   '"+obj.getMothername()+"', '"+ obj.getAddress()+"', '"+obj.getUsername()+"', '"+obj.getPassword()+"', date(), '"+obj.getPhone()+"')";
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

package usermanagement;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import dao.AddUserDetailDataDeclaration;
import databaseConnection.DatabaseConnection;

public class Deleteuserinformationdatabasecode {
	
	public boolean deleteuserinformation(AddUserDetailDataDeclaration deleteuser)
	{
		Statement st = null;
		try {
			Connection connection = DatabaseConnection.getConnection();
			String query = " delete from userinformation where  user_id = "+deleteuser.getUserid()+" ";
		    st = connection.createStatement();
			st.execute(query);
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

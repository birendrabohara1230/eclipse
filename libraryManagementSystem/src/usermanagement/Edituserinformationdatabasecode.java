package usermanagement;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

import dao.AddUserDetailDataDeclaration;
import databaseConnection.DatabaseConnection;

public class Edituserinformationdatabasecode {
		public boolean edituserinformation(AddUserDetailDataDeclaration edituser) {
			Statement st = null;
			try {
				Connection connection = DatabaseConnection.getConnection();
				String sql = "update userinformation set user_id = "+edituser.getUseridnew()+", first_name = '"+edituser.getFirstname()+"', last_name = '"+edituser.getLastname()+"', father_name =  '"+edituser.getFathername()+"', mother_name = '"+edituser.getMothername()+"',"
						+ "address = '"+edituser.getAddress()+"', username = '"+edituser.getUsername()+"', password = '"+edituser.getPassword()+"', phone = '"+edituser.getPhone()+"' where user_id = "+edituser.getUserid()+" ";
				st = connection.createStatement();
				st.execute(sql);
				connection.close();
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

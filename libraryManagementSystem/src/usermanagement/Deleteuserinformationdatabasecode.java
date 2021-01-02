package usermanagement;

import java.sql.Connection;
import java.sql.Statement;


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
		
		}
		finally {
			try {
				st.close();
			} catch (Exception e2) {

			}
		}
		return false;
	}
	
}

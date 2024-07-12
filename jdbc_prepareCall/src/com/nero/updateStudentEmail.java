package com.nero;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import com.nero.utility.ConnectionFactory;

public class updateStudentEmail {

	public static void main(String[] args) {
		CallableStatement cs = null;
		String call_string = "{ call updateStudentEmail(?,?) }";
		
		try {
			cs = ConnectionFactory.getDBConnection().prepareCall(call_string);
			
			cs.setInt(1, 1);
			cs.setString(2, "jack@yahoo.com");
			cs.registerOutParameter(2, Types.VARCHAR);
			
			cs.execute();
			String email = cs.getString(2);
			System.out.println("updated email "+email);
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}

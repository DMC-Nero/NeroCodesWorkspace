package com.nero;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import com.nero.utility.ConnectionFactory;

public class getNameAndEmail {

	public static void main(String[] args) {
		CallableStatement cs = null;
		String call_string = "{ call getNameAndEmail(?,?,?) }";
		
		try {
			cs = ConnectionFactory.getDBConnection().prepareCall(call_string);
			
			cs.setInt(1, 1);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.VARCHAR);
			
			cs.execute();
			String name = cs.getString(2);
			String email = cs.getString(3);
			
			System.out.println("name "+name+" email " + email);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}

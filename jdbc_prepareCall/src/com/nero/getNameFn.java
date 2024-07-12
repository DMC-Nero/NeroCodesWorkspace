package com.nero;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import com.nero.utility.ConnectionFactory;

public class getNameFn {

	public static void main(String[] args) {
		CallableStatement cs = null;
		String call_string = "{ ? = call getName(?) }";
		String res = "";
		
		try {
			cs = ConnectionFactory.getDBConnection().prepareCall(call_string);
			
			cs.setInt(2, 1);
			cs.registerOutParameter(1, Types.VARCHAR);
			cs.execute();
			
			res = cs.getString(1);
			
			System.out.println("the result is "+ res);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

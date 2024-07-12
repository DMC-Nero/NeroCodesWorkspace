package com.nero;

import java.sql.CallableStatement;
import java.sql.Types;

import com.nero.utility.ConnectionFactory;

public class getstudentname {

	public static void main(String[] args) {
		CallableStatement cs = null;
		String call_string = "{ call getstudentname(?,?)}";
		
		try {
			cs = ConnectionFactory.getDBConnection().prepareCall(call_string);
			cs.setInt(1,1);
			cs.registerOutParameter(2, Types.VARCHAR);	// type registration
			
			cs.execute();
			
			String name = cs.getString(2);
			System.out.println("Name of roll number 1 is " + name);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}

}

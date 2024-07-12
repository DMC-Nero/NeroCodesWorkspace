package com.nero;

import java.sql.CallableStatement;

import com.nero.utility.ConnectionFactory;

public class App1 {

	public static void main(String[] args) {
		CallableStatement cs = null;
		String call_string = "{ call createstudent(?,?,?)} ";
		
		try {
			cs = ConnectionFactory.getDBConnection().prepareCall(call_string);
			cs.setInt(1, 1);
			cs.setString(2, "jack");
			cs.setString(3, "jack@gmail.com");
			
			cs.execute();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}

}

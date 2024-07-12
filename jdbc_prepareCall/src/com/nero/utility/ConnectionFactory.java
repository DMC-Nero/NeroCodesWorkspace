package com.nero.utility;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	public static Connection getDBConnection() {
		String fileName = "//Users//natrajvemula//git//NeroCodesWorkspace//jdbc_two_bluk_ops//db-info.properties";		//modify
		Connection con = null;
		
		Properties props = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(fileName);
			props.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String db_url = props.getProperty("db.url");
		String db_username = props.getProperty("db.user");
		String db_password = props.getProperty("db.password");
		
		try {
			con = DriverManager.getConnection(db_url , db_username , db_password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return con;
		
	}
}

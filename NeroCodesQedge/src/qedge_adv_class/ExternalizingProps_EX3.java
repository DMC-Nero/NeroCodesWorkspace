package qedge_adv_class;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class ExternalizingProps_EX3 {

	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		InputStream is = new FileInputStream("db-info.properties");
		props.load(is);
		
		String url = props.getProperty("db.url");
		String user = props.getProperty("db.user");
		String password = props.getProperty("db.password");
		
		Connection conn = DriverManager.getConnection(url,user,password);
		System.out.println(conn);
	
	}

}

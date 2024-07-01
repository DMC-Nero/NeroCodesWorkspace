package qedge_adv_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class jdbc_one {

	public static void main(String[] args) throws SQLException {
		// connect to mysql db using mysql driver
		// using Driver object connect() mehtod
		
		Driver d1 = new com.mysql.cj.jdbc.Driver();
		
		String url = "jdbc:mysql://localhost:3306/testdb";
		Properties props = new Properties();
		props.put("user", "root");
		props.put("password", "Vishnupadma@1");
		
		// Using driver object
//		Connection conn = d1.connect(url, props);
//		System.out.println(conn);
		
		// Using DriverManager class
		Connection conn = DriverManager.getConnection(url,props);
		System.out.println(conn);
	}

}

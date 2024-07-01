package qedge_adv_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBC_4 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/testdb";
		Properties props = new Properties();
		props.put("user", "root");
		props.put("password", "Vishnupadma@1");
		
		Connection conn = DriverManager.getConnection(url,props);
		System.out.println(conn);
	}

}

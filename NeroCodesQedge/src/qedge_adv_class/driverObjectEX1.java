//  create a "student" in the DB with following 3 colums:
//		sid, sname, email.

package qedge_adv_class;

import java.sql.*;

import java.util.Properties;

public class driverObjectEX1 {

	public static void main(String[] args) throws SQLException {
		java.sql.Driver d1 = new com.mysql.cj.jdbc.Driver();
		
		String url = "jdbc:mysql://localhost:3306/testdb";
		Properties props = new Properties();
		props.put("user", "root");
		props.put("password", "Vishnupadma@1");
		
		// #1 
		Connection conn = d1.connect(url, props);
		System.out.println(conn);
		// #2 
		Statement st = conn.createStatement();
		
		// DML Statement
		String sql = "insert into student values(1,'jack','jack@gmail.com')";
		
		// #3
		int count = st.executeUpdate(sql);
		
		System.out.println("Rows(s) affected : "+ count);
		
		// #4
		conn.close();
	}

}

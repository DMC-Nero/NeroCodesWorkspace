package qedge_adv_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class DriverManager_EX2 {

	public static void main(String[] args) throws Exception {
		Driver d1 = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d1);
		
		String url = "jdbc:mysql://localhost:3306/testdb";
		Properties props = new Properties();
		props.put("user", "root");
		props.put("password", "Vishnupadma@1");
		
		Connection conn = DriverManager.getConnection(url,props);
		System.out.println(conn);
		
		String sql = "insert into student values(2,'jane','jane@mail')";
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		
		System.out.println(count + " rows affected");
	}

}

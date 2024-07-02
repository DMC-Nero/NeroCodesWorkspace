package qedge_adv_class;

import java.util.Properties;
import java.sql.*;
import java.io.*;

public class ResultSet_EX5 {

	public static void main(String[] args) throws Exception{
		Properties props = new Properties();
		InputStream is = new FileInputStream("db-info.properties");
		props.load(is);
		
		String url = props.getProperty("db.url");
		String user = props.getProperty("db.user");
		String password = props.getProperty("db.password");
		
		Connection conn = DriverManager.getConnection(url,user,password); 
//		System.out.println(conn);
		
		String sql = "select * from student";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int sid = rs.getInt(1);
			String sname = rs.getString(2);
			String email = rs.getString(3);
			
			System.out.println(sid + "      " +sname + "      "+ email);
		}
		
		
	}

}

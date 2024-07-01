package qedge_adv_class;

import java.io.*;
import java.sql.*;
import java.util.*;

public class StandardJDBC_Ex4 {

	public static void main(String[] args) {
		Properties props = new Properties();
		InputStream is;
		Connection conn = null;
		Statement st = null;
		try {
			is = new FileInputStream("db-info.properties");
			props.load(is);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String url = props.getProperty("db.url");
		String user = props.getProperty("db.user");
		String password = props.getProperty("db.password");
		String sql = "insert into student values(3,'Nero','Nero@gmail')";
//		String sql = "delete from student where sid=3";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
			
			st = conn.createStatement();
			int count = st.executeUpdate(sql);
			
			System.out.println(count + " rows affected");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}

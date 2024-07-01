package qedge_adv_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Scanner;

public class JDBC_3 {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter driver class name");
		String dname = sc.nextLine();
		// Class.forName(“com.mysql.cj.jdbc.Driver”);
		Class.forName(dname);

		
		String url = "jdbc:mysql://localhost:3306/testdb";
		Properties props = new Properties();
		props.put("user", "root");
		props.put("password", "Vishnupadma@1");
		
		Connection conn = DriverManager.getConnection(url,props);
		
		System.out.println(conn);
		
	}

}

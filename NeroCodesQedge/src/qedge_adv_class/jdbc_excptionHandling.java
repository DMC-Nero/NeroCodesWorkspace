package qedge_adv_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_excptionHandling {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/testdb";
		String dbUser = "root";
		String dbPassword = "Vishnupadma@1";
		String sql= "insert into student(sid, sname, email) values(1,'jane', 'jane@gmail.com')";
		
		try {
			Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
			Statement st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException ex) {
			ex.printStackTrace();
			int errorCode = ex.getErrorCode();
			System.out.println("Error code -> " + errorCode);
			
			String sqlState = ex.getSQLState();
			System.out.println("Error message -> " + sqlState);
		}
		System.out.println("Done");
	}

}

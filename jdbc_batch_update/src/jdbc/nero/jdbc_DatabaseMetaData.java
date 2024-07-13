package jdbc.nero;

import java.sql.*;

public class jdbc_DatabaseMetaData {
	
	// DatabaseMetaData 
	
	public static void main(String[] args) throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/testdb";
		String dbUser = "root";
		String dbPassword = "Vishnupadma@1";
		
		Connection conn = DriverManager.getConnection(URL ,dbUser,dbPassword);
		
		DatabaseMetaData mdata = conn.getMetaData();
		System.out.println(mdata.supportsBatchUpdates());
		
	}

}

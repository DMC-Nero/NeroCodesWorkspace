package jdbc.nero;

import java.sql.*;
import java.util.Arrays;

// Batch Upadate using PreparedStatement

public class jdbc_batch_update_prepareStatement {

	public static void main(String[] args) throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/testdb";
		
		String dbUser = "root";
		String dbPassword = "Vishnupadma@1";
		
		Connection conn = DriverManager.getConnection(URL,dbUser,dbPassword);
		
		String sql = "insert into student values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, 5);
		ps.setString(2, "jay");
		ps.setString(3, "jay@gamil.com");
		ps.addBatch();
		
		ps.setInt(1, 6);
		ps.setString(2, "ajay");
		ps.setString(3, "ajay@gmail.com");
		ps.addBatch();
		
		int[] count = ps.executeBatch();
		
		System.out.println(Arrays.toString(count));
		
		System.out.println("Done...");
	}

}

package jdbc.nero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class jdbc_batch_update_statement {

	public static void main(String[] args) throws SQLException {
		
		String dbURL = "jdbc:mysql://localhost:3306/testdb";
		String dbUser = "root";
		String dbPassword = "Vishnupadma@1";
		
		Connection conn = DriverManager.getConnection(dbURL,dbUser,dbPassword);
		Statement st = conn.createStatement();
		
		String sql1 = "insert into student values(3, 'john' , 'john@gmail.com')";
		String sql2 = "update student set email='jack@gmail.com' where sid = 1";
		
		st.addBatch(sql1);
		st.addBatch(sql2);
		
		//st.clearBatch();
		
		int[] counts = st.executeBatch();
		
		System.out.println(Arrays.toString(counts));
		
		System.out.println("Done...");
	
	}

}

package jdbc.nero;

import java.sql.*;


public class jdbc_advResultSet_StatementObj {

	public static void main(String[] args) throws SQLException {
		
		String URL = "jdbc:mysql://localhost:3306/testdb";
		
		String dbUser = "root";
		String dbPassword = "Vishnupadma@1";
			
		Connection conn = DriverManager.getConnection(URL,dbUser,dbPassword);	
			
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE , ResultSet.CONCUR_READ_ONLY);
			String sql = "select * from student";

			ResultSet rs = st.executeQuery(sql);

		// Forward Traversal
			while(rs.next()) {
				int sid = rs.getInt(1);
				String sname = rs.getString(2);
				String email = rs.getString(3);
				System.out.println(sid+ " \t\t " + sname +"   "+ " \t\t "+ email);
				
			}
			System.out.println();
		// Backward Traversal
			while(rs.previous()) {
				int sid = rs.getInt(1);
				String sname = rs.getString(2);
				String email = rs.getString(3);
				System.out.println(sid+ " \t\t " + sname +"   "+ " \t\t "+ email);
			}

	}

}

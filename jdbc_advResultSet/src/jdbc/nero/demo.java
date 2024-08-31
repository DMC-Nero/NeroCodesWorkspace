package jdbc.nero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {
	public static void main(String[] args) throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/testdb";

		String dbUser = "root";
		String dbPassword = "Vishnupadma@1";

		Connection conn = DriverManager.getConnection(URL, dbUser, dbPassword);

		Statement st = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
		String sql = "select * from student";
		
		ResultSet rs = st.executeQuery(sql);

	// Forward Traversal
		while(rs.next()) {
			int sid = rs.getInt(1);
			if(sid == 4) {
				rs.updateString(2, "Zero");
				rs.updateRow();
			}
			
		}
		System.out.println("done");
	}
}


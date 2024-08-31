package qedge_adv_class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class jdbc_transcation {

	public static void main(String[] args) throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/testdb";

		String dbUser = "root";
		String dbPassword = "Vishnupadma@1";

		Connection conn = DriverManager.getConnection(URL, dbUser, dbPassword);
		
		System.out.println(conn.getTransactionIsolation());
		
		DatabaseMetaData metaData = (DatabaseMetaData) conn.getMetaData();
		System.out.println(metaData.supportsTransactions());
		System.out.println(metaData.supportsTransactionIsolationLevel(Connection.TRANSACTION_SERIALIZABLE));
		
		conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
		System.out.println(conn.getTransactionIsolation());
		
		System.out.println(conn.getAutoCommit());
		
		//Turning off the AutoCommit mode
		conn.setAutoCommit(false);
		String sql1 = "update student set email='jack@gmail.com' where sid =1";
		String sql2 = "insert into student values(6,'james','james@gmail.com')";
		
		Statement st = conn.createStatement();
		
		try {
			st.execute(sql1);
			st.execute(sql2);
			conn.commit();
		} catch(Exception e) {
			conn.rollback();
		}
		
		System.out.println("Done...");
		
	}

}

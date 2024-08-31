package qedge_adv_class;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class jdbc_rowSetFactory {

	public static void main(String[] args) throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/testdb";
		String dbUser = "root";
		String dbPassword = "Vishnupadma@1";
		
		// JDBCRowSer
		RowSetFactory factory = RowSetProvider.newFactory();
		JdbcRowSet jdbcRS = factory.createJdbcRowSet();
		
		jdbcRS.setUrl(dbURL);
		jdbcRS.setUsername(dbUser);
		jdbcRS.setPassword(dbPassword);
		
		//jdbcRS.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);
		String sql ="SELECT * FROM student";
		jdbcRS.setCommand(sql);
		jdbcRS.execute();
		
		while (jdbcRS.next()) {
			System.out.println(jdbcRS.getInt(1) + "\t" + jdbcRS.getString(2)+ "\t " + jdbcRS.getString(3));
		}
		
		System.out.println("====================");
		
		CachedRowSet cachedRS = factory.createCachedRowSet();
		cachedRS.setUrl(dbURL);
		cachedRS.setUsername(dbUser);
		cachedRS.setPassword(dbPassword);
		
		//cachedRS.setType(ResultSet.TYPE_SCROLL_INSENSITIVE);
		cachedRS.setCommand(sql);
		cachedRS.execute();
		
		while (jdbcRS.next()) {
			System.out.println(cachedRS.getInt(1) + "\t" + cachedRS.getString(2)+ "\t " + cachedRS.getString(3));
		}
		System.out.println("Done");
	}

}

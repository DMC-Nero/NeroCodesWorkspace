package com.nero;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class App {

	private static Connection connection;

	public static void main(String[] args) throws SQLException, InterruptedException {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/testdb";
		String dbUser = "root";
		String dbPassword = "Vishnupadma@1";
		
		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setJdbcUrl(URL);
		ds.setUsername(dbUser);
		ds.setPassword(dbPassword);
		
		ds.setMaximumPoolSize(2);
		System.out.println(ds.getMaximumPoolSize());
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				
				try {
					Connection con1 = ds.getConnection();
					System.out.println(con1);
					
					Thread.sleep(10000);
					con1.close();
				} catch (SQLException | InterruptedException e) {
				}				
			}
		});
		
		t1.start();
		
		Connection con2 = ds.getConnection();
		System.out.println(con2);
		
		Thread.sleep(100);
		
		Connection con3 = ds.getConnection();
		System.out.println(con3);

		
	}

}

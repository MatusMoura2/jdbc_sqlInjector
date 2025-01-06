package com.matusmoura.servelet;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	public static Connection initializeDatabase() throws Exception{

		String jdbcURL = "jdbc:mysql://localhost:3306/jdbc_users";
		String jdbcUsername = "root";
		String jdbcPassword = System.getenv("DB_PASSWORD");

		 if (jdbcPassword == null || jdbcPassword.isEmpty()) {
	            throw new IllegalStateException("A variável de ambiente 'DB_PASSWORD' não foi configurada.");
	        }

		 Class.forName("com.mysql.cj.jdbc.Driver");
	        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
	}
}

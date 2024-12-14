package com.learning.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DBConnection {
	
	private static Connection DB_CONN=null;
	
	private static String CONN_STRING = "jdbc:mysql://localhost:3306/jdbcdemo";
	
	// we need to read the username and password using the properties file
	
	private static Properties props = new Properties();
	
	
	
	// one way of connecting using the traditional driver manager way
	
	
	public static Connection getDBConnection()
	{
		try {
			props.load(Files.newInputStream(Path.of("src/employee.properties"), StandardOpenOption.READ));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

		try {
			DB_CONN = DriverManager.getConnection(CONN_STRING, props.getProperty("username"), props.getProperty("password"));
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return DB_CONN;
	}
	
	
	
}

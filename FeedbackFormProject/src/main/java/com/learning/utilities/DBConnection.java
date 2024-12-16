package com.learning.utilities;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
	private static String CONN_URL = "jdbc:mysql://localhost:3306/feedbackform_project";
	
	private static Connection CONN = null;
	
	
	public static Connection getDBConnection() throws IOException, SQLException, URISyntaxException, ClassNotFoundException {
		
//		Properties props = new Properties();
//		
//		props.load(Files.newInputStream(Path.of("employee.properties"), StandardOpenOption.READ));
//		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//CONN = DriverManager.getConnection(CONN_URL, props.getProperty("username"), props.getProperty("password"));
		CONN = DriverManager.getConnection(CONN_URL, "root", "root");
		
		return CONN;
	}
	

}

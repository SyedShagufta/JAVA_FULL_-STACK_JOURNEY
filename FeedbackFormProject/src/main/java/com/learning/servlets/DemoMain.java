package com.learning.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;

import com.learning.utilities.DBConnection;

public class DemoMain {

	public static void main(String[] args) throws IOException, SQLException, URISyntaxException, ClassNotFoundException {
		Connection con = DBConnection.getDBConnection();
		
		if(con!=null) {
			System.out.println("Successfully connected to the database");
		}
		else {
			System.out.println("Failed to connect");
		}


	}

}

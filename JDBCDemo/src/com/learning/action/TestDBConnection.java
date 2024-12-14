package com.learning.action;

import java.sql.Connection;

import com.learning.utilities.DBConnection;

public class TestDBConnection {

	public static void main(String[] args) {
		
		Connection con = DBConnection.getDBConnection();
		
		if(con!=null) {
			System.out.println("Successfully connected to the database");
		}
		else {
			System.out.println("Failed to connect");
		}

	}

}

package com.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.learning.utilities.DBConnection;

public class PrintAllEmployees {
	
	public static void printAllEmployees() throws SQLException
	{
		Connection conn = DBConnection.getDBConnection();
		String query = "Select * from employee";
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		ResultSet rs = pstmt.executeQuery();
		
		System.out.printf("%-15s %-15s %-15s%n", "Employee ID", "Salary", "Employee Name");
		System.out.println("=====".repeat(10));
		
		while(rs.next()) {
			System.out.printf("%-15d %-15.2f %-15s%n", rs.getInt(1), rs.getDouble(2), rs.getString(3));
			System.out.println("-----".repeat(10));
		}
		
	}

}

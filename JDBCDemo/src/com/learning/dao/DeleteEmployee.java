package com.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.learning.utilities.DBConnection;

public class DeleteEmployee {
	
	public static void deleteEmployeeById(int id) throws SQLException
	{
		Connection conn = DBConnection.getDBConnection();
		
		String query = "delete from employee where empId=?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, id);
		
		int i = pstmt.executeUpdate();
		System.out.printf("%d records updated",i);
		
	}

}

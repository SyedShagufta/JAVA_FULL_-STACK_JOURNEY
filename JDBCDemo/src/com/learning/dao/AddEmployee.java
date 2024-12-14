package com.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.learning.bean.Employee;
import com.learning.utilities.DBConnection;

public class AddEmployee {
	
	public static void addEmployee(Employee emp) throws SQLException
	{
		
		Connection conn = DBConnection.getDBConnection();
		
		String query = "insert into employee values(?, ?, ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setInt(1, emp.getId());
		pstmt.setDouble(2, emp.getSalary());
		pstmt.setString(3, emp.getEmpName());
		
		int i = pstmt.executeUpdate();
		System.out.printf("%d records updated",i);
	}

}

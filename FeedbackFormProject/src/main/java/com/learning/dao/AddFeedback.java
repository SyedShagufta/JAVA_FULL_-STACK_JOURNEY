package com.learning.dao;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.learning.bean.Feedback;
import com.learning.utilities.DBConnection;

public class AddFeedback {
	
	public static boolean addFeedback(Feedback feedback) throws IOException, SQLException, URISyntaxException, ClassNotFoundException
	{
		Connection conn = DBConnection.getDBConnection();
		boolean success=false;
		
		String query = "insert into feedback values(?,?,?,?)";
		
		if(conn!=null) {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, feedback.getFirstName());
			pstmt.setString(2, feedback.getLastName());
			pstmt.setString(3, feedback.getEmail());
			pstmt.setString(4, feedback.getFeedback());
			int rowsAffected = pstmt.executeUpdate();
            success = (rowsAffected > 0); // If rows are affected, return true
		}
		
		return success;
		
	}

}

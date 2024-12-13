package com.learning.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// get the response
		String firstName = req.getParameter("first_name");
		String lastName = req.getParameter("last_name");
		String email = req.getParameter("email");
		String feedback = req.getParameter("feedback");
		
		resp.setContentType("text/html");
		resp.getWriter().println("""
				
				<h1> Thank you, %s </h1>
				
				<h2> Your details are :
				
				First name: %s
				
				Last name: %s
				
				email: %s
				
				feedback: %s
				
				</h2>
				
				""".formatted(firstName, firstName, lastName, email, feedback));
		
	}
	
	

}

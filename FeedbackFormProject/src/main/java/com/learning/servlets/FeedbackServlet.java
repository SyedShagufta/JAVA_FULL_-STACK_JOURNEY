package com.learning.servlets;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;

import com.learning.bean.Feedback;
import com.learning.dao.AddFeedback;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
        resp.sendRedirect(req.getContextPath() + "/index.jsp");
        
	}



	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// get the response
		String firstName = req.getParameter("first_name");
		String lastName = req.getParameter("last_name");
		String email = req.getParameter("email");
		String feedback = req.getParameter("feedback");
		
		Feedback myfeedback = new Feedback(firstName, lastName, email, feedback);
		

        try {
            // Call the AddFeedback class to add the feedback
            boolean isAdded = AddFeedback.addFeedback(myfeedback);
            String redirectUrl = isAdded ? req.getContextPath() + "/thankyou.jsp" : req.getContextPath() + "/error.jsp";
            resp.sendRedirect(redirectUrl);

        } catch (IOException | SQLException | URISyntaxException e) {
            // Log the exception and redirect to an error page
            e.printStackTrace();
            req.setAttribute("errorMessage", "An error occurred while submitting your feedback. Please try again later.");
            req.getRequestDispatcher("/error.jsp").forward(req, resp);
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

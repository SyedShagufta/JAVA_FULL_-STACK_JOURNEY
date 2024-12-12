package com.learning.servlets;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")
public class FirstServlet implements Servlet{
	
	ServletConfig myServletConifg;
	
	// Life cycle methods
	
	// first this method is going to get executed
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.myServletConifg=arg0;
		System.out.println("The Servlet is being initialized !!");
	}
	
	// we can call this method as many times as required
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service method requested!!");
	}

	// This method is going to get executed at last 
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("The servlet is being destroyed!! ");
	}
	
	// NON - Life cycle methods
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.myServletConifg;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This is a first servlet!";
	}

}

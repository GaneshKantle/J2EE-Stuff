package com.dcl;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/Test")
public class Test extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String place = req.getParameter("location");
		
		System.out.println(name+" "+place);
		resp.setContentType("text/html");
		resp.getWriter().println("<h1>Hey "+name+", You are from "+place+"</h1>");
		
	}

}

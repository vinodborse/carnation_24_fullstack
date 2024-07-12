package com.ts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class Sample extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			String searchQuery = req.getParameter("q");
			
			String result;
			if(searchQuery.equals("cricket")) {
				result = "GET:- a game that is played with a bat and ball on a large area of grass by two teams of eleven players";
			} else if(searchQuery.equals("india")) {
				result = "GET:- India, officially the Republic of India, is a country in South Asia. It is the seventh-largest country by area; the most populous country as of June 2023; and from the time of its independence in 1947, the world's most populous democracy";
			} else {
				result = "GET:- Sorry";
			}
			
			
			
			req.setAttribute("rs", result);
			req.getRequestDispatcher("sample.jsp").forward(req, resp);
			
	    }
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		String searchQuery = req.getParameter("q");
		
		String result;
		if(searchQuery.equals("cricket")) {
			result = "POST:- a game that is played with a bat and ball on a large area of grass by two teams of eleven players";
		} else if(searchQuery.equals("india")) {
			result = "POST:- India, officially the Republic of India, is a country in South Asia. It is the seventh-largest country by area; the most populous country as of June 2023; and from the time of its independence in 1947, the world's most populous democracy";
		} else {
			result = "POST:- Sorry";
		}
		
		
		
		req.setAttribute("rs", result);
		req.getRequestDispatcher("sample.jsp").forward(req, resp);
	    }
}

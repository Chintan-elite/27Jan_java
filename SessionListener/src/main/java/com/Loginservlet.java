package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Loginservlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String uname = req.getParameter("uname");
		String pass =req.getParameter("pass");
		
		 if(uname.equals("admin") && pass.equals("admin"))
		 {
			 PrintWriter pw  =resp.getWriter();
			 HttpSession session = req.getSession();
			 session.setAttribute("uname", uname);
			 
			ServletContext cx = req.getServletContext();
			int current = (Integer) cx.getAttribute("currentUser");
			int total = (Integer)cx.getAttribute("totalUser");
			 
			 
			pw.print("<h1>Current users : "+current+" </h1>");
			pw.print("<h1>total users : "+total+" </h1>");
			
			pw.print("<a href='logout'>Logout</a>");
		 }
		 else
		 {
			 req.getRequestDispatcher("login.jsp").forward(req, resp);
		 }
		
		
		
		
	}
}

package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String uname = 	req.getParameter("uname");
	String email = req.getParameter("email");
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnjava","root","");
		
		PreparedStatement ps = cn.prepareStatement("insert into user values(?,?,?)");
		ps.setInt(1, 0);
		ps.setString(2, uname);
		ps.setString(3, email);
		
		
		int i =  ps.executeUpdate();
		
		if(i>0)
		{
			req.setAttribute("msg", "Registration Success !!!");
			req.getRequestDispatcher("registration.jsp").forward(req, resp);
		}
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
		
	}
}

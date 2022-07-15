package com;

import java.io.IOException;
import java.io.PrintWriter;
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
		
		String uname =  req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String adr = req.getParameter("adr");
		
	    PrintWriter pw = resp.getWriter();
//		pw.write("<h1>username :  "+uname+"</h1>");
//		pw.write("<h1>email :  "+email+"</h1>");
//		pw.write("<h1>Password :  "+pass+"</h1>");
//		pw.write("<h1>Address :  "+adr+"</h1>");
//		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/27jan","root","");
			PreparedStatement ps = cn.prepareStatement("insert into data values(?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, email);
			ps.setString(4, pass);
			ps.setString(5, adr);
			
			int i = ps.executeUpdate();
			if(i>0)
			{
				pw.write("<h1>Data inserted successfully....</h1>");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}

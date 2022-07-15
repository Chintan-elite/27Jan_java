package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DBConnection;

@WebServlet("/reg")
public class RegistrationController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String adr = req.getParameter("adr");
		
		Connection cn = DBConnection.getConn();
		String qry = "insert into data values(?,?,?,?,?)";
		try {
			PreparedStatement ps = cn.prepareStatement(qry);
			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, email);
			ps.setString(4, pass);
			ps.setString(5, adr);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				resp.setContentType("text/html");
				PrintWriter pw = resp.getWriter();
				pw.print("Data insterd succsfully....");
				
				RequestDispatcher rd = req.getRequestDispatcher("Success.html");
				rd.forward(req, resp);
				//rd.include(req, resp);
				//resp.sendRedirect("Success.html");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

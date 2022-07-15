package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DBConnection;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uid = req.getParameter("uid");
		int id = Integer.parseInt(uid);
		
		Connection cn = DBConnection.getConn();
		PreparedStatement ps;
		try {
			ps = cn.prepareStatement("select * from data where id=?");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			User u = null;
			if(rs.next())
			{
				u = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
			
			req.setAttribute("data", u);
			req.getRequestDispatcher("updateForm.jsp").forward(req, resp);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

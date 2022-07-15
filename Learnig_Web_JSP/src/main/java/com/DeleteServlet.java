package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DBConnection;

@WebServlet("/delete")
public class DeleteServlet  extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uid = req.getParameter("uid");
		int id = Integer.parseInt(uid);
		
		Connection cn = DBConnection.getConn();
		try {
			PreparedStatement ps = cn.prepareStatement("delete from data where id=?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if(i>0)
			{
				req.getRequestDispatcher("display").forward(req, resp);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

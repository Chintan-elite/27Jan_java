package com;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/state")
public class GetAllstate extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int cid = Integer.parseInt(req.getParameter("val"));
		PrintWriter pw = resp.getWriter();
		Connection cn = DBConnection.getConn();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from state where cid=?");
			ps.setInt(1, cid);
			
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			pw.write("<option value="+rs.getInt(1)+">"+rs.getString(2)+"</option>");
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

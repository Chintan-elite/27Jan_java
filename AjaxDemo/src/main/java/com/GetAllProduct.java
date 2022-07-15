package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DBConnection;

@WebServlet("/product")
public class GetAllProduct extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	    String pname = req.getParameter("val");
		PrintWriter pw = resp.getWriter();
		Connection cn = DBConnection.getConn();
		try {
			Statement st = cn.createStatement();
			
			
		ResultSet rs = st.executeQuery("select * from prod where pname like '"+pname+"%'");
		while(rs.next())
		{
			pw.write("<ul><li>"+rs.getString(2)+"</li></ul>");
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

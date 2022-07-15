package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet
{ 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>Welcom to Servlet2</h1>");
		ServletContext c1  =req.getServletContext();
		String driver =  c1.getInitParameter("driver");
		pw.print("<h2>"+driver+"</h2>");
		
		ServletConfig c2 = getServletConfig();
		String path =  c2.getInitParameter("path");
		pw.print("<h2>"+path+"</h2>");
	}
}

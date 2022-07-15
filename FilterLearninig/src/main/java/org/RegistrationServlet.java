package org;

import java.io.IOException;
import java.io.PrintWriter;

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
		PrintWriter pw = resp.getWriter();
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String adr = req.getParameter("adr");
		
		pw.print("<h1>Uname : "+uname+"</h1>");
		pw.print("<h1>Email : "+email+"</h1>");
		pw.print("<h1>Pass : "+pass+"</h1>");
		pw.print("<h1>Adr : "+adr+"</h1>");
		
		
		
		
		
	}
}

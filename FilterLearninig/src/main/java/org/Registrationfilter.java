package org;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/reg")
public class Registrationfilter  extends HttpFilter
{
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		ServletContext cx = req.getServletContext();
	    String value =  cx.getInitParameter("underMaintanance");
		if(value.equals("yes"))
		{
			req.getRequestDispatcher("maintanance.jsp").forward(req, resp);
		}
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String cpass = req.getParameter("cpass");
		String adr = req.getParameter("adr");
		RequestDispatcher rd =  req.getRequestDispatcher("registration.jsp");
		if(uname == "" || uname == null)
		{
			req.setAttribute("unameE", "Uname can not be blank");
			rd.forward(req, resp);
		}
		
		
		if(email == "" || email == null)
		{
			req.setAttribute("emailE", "Email can not be blank");
			rd.forward(req, resp);
		}
		else if(!EmailValidation.emailCheck(email))
		{
			req.setAttribute("emailE", "Invalid email formate");
			rd.forward(req, resp);
		}
		
		if(pass == "" || pass == null)
		{
			req.setAttribute("passE", "Pass can not be blank");
			rd.forward(req, resp);
		}
		else if(!PasswordValidation.passCheck(pass))
		{
			req.setAttribute("passE", "Invalid pass format");
			rd.forward(req, resp);
		}
		
		if(!cpass.equals(pass))
		{
			req.setAttribute("cpassE", "Cpass must be same as Pass");
			rd.forward(req, resp);
		}
		
		if(adr == "" || adr == null)
		{
			req.setAttribute("adrE", "Adr can not be blank");
			rd.forward(req, resp);
		}
		
		
		
		chain.doFilter(req, resp);
	}
}

package com;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OtpVarification
 */
@WebServlet("/OtpValidation")
public class OtpVarification extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String otp = request.getParameter("otp");
		
		ServletContext cx = request.getServletContext();
		String myOTP = (String)cx.getAttribute("myOTP");
		
		//System.out.println("entered otp : "+otp);
		//System.out.println("myOTP : "+myOTP);
		
		if(otp.equals(myOTP))
		{
			request.getRequestDispatcher("home.jsp").forward(request, response);
			
		}
		else
		{
			request.setAttribute("err", "Invalid otp");
			request.getRequestDispatcher("otpVarification.jsp").forward(request, response);
			
		}
		
	
	}

}

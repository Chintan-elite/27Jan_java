package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.USerDao;
import model.User;

@WebServlet("/reg")
public class RegistrationController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int uid = Integer.parseInt(req.getParameter("uid"));
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		if(uid>0)
		{
			User u = new User();
			u.setUid(uid);
			u.setUname(uname);
			u.setPass(pass);
			
			USerDao dao = new USerDao();
			int i =  dao.editUser(u);
			
			if(i>0)
			{
				
				req.getRequestDispatcher("displayUser").forward(req, resp);
			}
		}
		else
		{
			User u = new User();
			u.setUname(uname);
			u.setPass(pass);
			
			USerDao dao = new USerDao();
			int i =  dao.addUser(u);
			
			if(i>0)
			{
				
				req.getRequestDispatcher("displayUser").forward(req, resp);
			}
			
		}
		
	}
}

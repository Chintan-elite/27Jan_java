package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.USerDao;
import model.User;

@WebServlet("/displayUser")
public class DisplayUserController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		USerDao dao = new USerDao();
		ArrayList<User> al =  dao.getAllUser();
		req.setAttribute("user", dao.getDataById(0));
		req.setAttribute("data", al);
		req.getRequestDispatcher("displayuser.jsp").forward(req, resp);
		
	}
}

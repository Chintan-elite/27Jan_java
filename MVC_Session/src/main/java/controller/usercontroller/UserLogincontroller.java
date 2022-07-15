package controller.usercontroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

@WebServlet("/login")
public class UserLogincontroller  extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		
		User ud = new User();
		ud.setUname(uname);
		ud.setPass(pass);
		
		UserDao dao = new UserDao();
		boolean b =  dao.loginCheck(ud);
		
		if(b)
		{
			HttpSession session = req.getSession();
			session.setAttribute("uname", uname);
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
		else
		{
			req.setAttribute("err", "Invalid username or password !!!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}
}

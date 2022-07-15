package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empdao;
import model.Employee;

@WebServlet("/display")
public class DsplayController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		empdao dao = new empdao();
		ArrayList<Employee> emp = dao.getAllEmp();
		req.setAttribute("data", emp);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
		
	}
}

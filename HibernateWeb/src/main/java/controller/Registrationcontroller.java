package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empdao;
import model.Employee;


@WebServlet("/reg")
public class Registrationcontroller extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int uid = 0;
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String dept = request.getParameter("dept");
		if(!id.equals(""))
		{
		uid = Integer.parseInt(id);
		}
		
		Employee emp = new Employee();
		emp.setId(uid);
		emp.setName(name);
		emp.setEmail(email);
		emp.setDept(dept);
		
		empdao dao = new empdao();
		dao.addemp(emp);
		
		
		
	}

}

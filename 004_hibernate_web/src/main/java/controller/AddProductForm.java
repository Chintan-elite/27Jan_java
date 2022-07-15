package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;

/**
 * Servlet implementation class AddProductForm
 */
public class AddProductForm extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductDao dao = new ProductDao();
		
		request.setAttribute("products", dao.viewAllProduct());
		request.setAttribute("data", dao.viewAllcat());
		request.getRequestDispatcher("addproduct.jsp").forward(request, response);
	
		
		
	}

}

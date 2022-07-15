package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Category;
import model.Product;

/**
 * Servlet implementation class AddNewProduct
 */
public class AddNewProduct extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer catid = Integer.parseInt(request.getParameter("catid"));
		String pname = request.getParameter("pname");
		String price = request.getParameter("price");
		
		Category ct = new Category();
		ct.setcId(catid);
		
		Product p = new Product();
		p.setpName(pname);
		p.setPrice(price);
		p.setCategory(ct);
		
		ProductDao dao = new ProductDao();
		dao.addProduct(p);
		request.getRequestDispatcher("addProduct").forward(request, response);
		
	}

}

package controller.productcontroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;

@WebServlet("/product")
public class DisplayProductController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ProductDao pdao = new ProductDao();
		ArrayList<Product> p =   pdao.getAllProduct();
		req.setAttribute("data", p);
		req.getRequestDispatcher("product.jsp").forward(req, resp);
		
	}
}

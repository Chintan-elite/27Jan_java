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

@WebServlet("/update") 
public class UpdateProductController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		int uid = Integer.parseInt(req.getParameter("uid"));
		
		ProductDao dao = new ProductDao();
		
		if(action.equals("delete"))
		{
			int i =  dao.deleteProduct(uid);
			if(i>0)
			{
				ArrayList<Product> pd =   dao.getAllProduct();
				req.setAttribute("data", pd);
				req.getRequestDispatcher("product.jsp").forward(req, resp);
		
			}
		}
		else if(action.equals("update"))
		{
			Product p1 = dao.getProdById(uid);
			ArrayList<Product> pd =   dao.getAllProduct();
			req.setAttribute("pdata", p1);
			req.setAttribute("data", pd);
			req.getRequestDispatcher("product.jsp").forward(req, resp);
	
		}
		
		
		
	}
}

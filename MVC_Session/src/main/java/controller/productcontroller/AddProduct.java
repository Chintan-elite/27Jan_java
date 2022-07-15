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

@WebServlet("/addProduct")
public class AddProduct extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pid = req.getParameter("pid");
		String pname = req.getParameter("pname");
		double price =Double.parseDouble(req.getParameter("price"));
		
		Product p = new Product();
		
		p.setPname(pname);
		p.setPrice(price);
		
		ProductDao pdao = new ProductDao();
		
		if(!pid.equals(""))
		{
			p.setPid(Integer.parseInt(pid));
			int i = pdao.editProduct(p);
			if(i>0)
			{
				ArrayList<Product> pd =   pdao.getAllProduct();
				req.setAttribute("data", pd);
				req.getRequestDispatcher("product.jsp").forward(req, resp);
			}
			
			
		}
		else
		{
	
		boolean b =  pdao.isExist(p);
		if(b)
		{
			ArrayList<Product> pd =   pdao.getAllProduct();
			req.setAttribute("data", pd);
			req.setAttribute("err", "Product alredy exist !!!");
			req.getRequestDispatcher("product.jsp").forward(req, resp);
	
		}
		else
		{
			int i = pdao.addProduct(p);
			if(i>0)
			{
				ArrayList<Product> pd =   pdao.getAllProduct();
				req.setAttribute("data", pd);
				req.setAttribute("msg", "Product added successfully !!!");
				req.getRequestDispatcher("product.jsp").forward(req, resp);
			}
		}
		}
	}
}

package controller.productcontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import model.Product;


@WebServlet("/searchProduct")
public class SearchProduct extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	    String pname = req.getParameter("val");
		PrintWriter pw = resp.getWriter();
		
		ProductDao pdao = new ProductDao();
		ArrayList<Product> p = pdao.getSearchProduct(pname);
		
		pw.write("<table class='table'><tr><th>PID</th><th>PNAME</th><th>PRICE</th><th>ACTION</th></tr>");
		for(Product pd : p)
		{
			pw.write("<tr><td>"+pd.getPid()+"</td><td>"+pd.getPname()+"</td><td>"+pd.getPrice()+"</td>");
			pw.write("<td><button class='btn btn-success' onclick='deleteData("+pd.getPid()+")'>Delete</button></td>");
			pw.write("<td><button class='btn btn-primary' onclick='updateData("+pd.getPid()+")'>Update</button></td></tr>");
			
		}
		pw.write("</table>");
		
		
		
		
	}
}

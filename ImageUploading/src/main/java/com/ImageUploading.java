package com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
@MultipartConfig
@WebServlet("/imgaeUpload")
public class ImageUploading extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//String img = "img";
		//String path = req.getServletContext().getRealPath("");
		//String uploadPath = path + File.separator+img;
		//System.out.println(uploadPath);
		String uploadPath = "D:\\Classwork\\27Jan_java\\ImageUploading\\src\\main\\webapp\\img";
		
//		File myfile = new File(uploadPath);
//		if(!myfile.exists())
//		{
//			myfile.mkdir();
//			System.out.println("File created...");
//			System.out.println(myfile.getAbsolutePath());
//		}
//		
		
		
		String uname=req.getParameter("uname");
		Part file=req.getPart("file");
		
		String fileName = Paths.get(file.getSubmittedFileName()).getFileName().toString();
		System.out.println(fileName);
		file.write(uploadPath+File.separator+fileName);
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","");
			PreparedStatement ps=(PreparedStatement) cn.prepareStatement("insert into upload values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, fileName);
			
			int i = ps.executeUpdate();
			if(i>0)
			{
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

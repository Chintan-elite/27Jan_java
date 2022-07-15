package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection
{
	public static void main(String[] args) {
		
		
		try 
		{
			//load the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
			
			//define connection url
			String url = "jdbc:mysql://localhost:3306/27jan";
			String uname = "root";
			String pass = "";
			
			//establish the connection
			Connection cn = DriverManager.getConnection(url,uname,pass);
			System.out.println("connection stableshed...");
			
			//ccreate statement
			Statement st = cn.createStatement();
			
			//execute query
			ResultSet rs = st.executeQuery("select * from emp");
			
			//process the resultset
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String dept = rs.getString(4);
				double sal = rs.getDouble("sal");
				
				System.out.println(id+" "+name+" "+email+" "+dept+" "+sal);
			}
			
			
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}

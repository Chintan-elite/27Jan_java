package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println("enter email : ");
		String email = sc.next();
		System.out.println("enter dept : ");
		String dept = sc.next();
		System.out.println("enter sal : ");
		double sal = sc.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/27jan";
			String uname = "root";
			String pass = "";
			
			Connection cn = DriverManager.getConnection(url,uname,pass);
			
//			PreparedStatement ps = cn.prepareStatement("insert into emp values(?,?,?,?,?)");
//			ps.setInt(1, 0);
//			ps.setString(2, name);
//			ps.setString(3, email);
//			ps.setString(4, dept);
//			ps.setDouble(5, sal);
//			int i =  ps.executeUpdate();
			
			Statement st = cn.createStatement();
			int i = st.executeUpdate("insert into emp values(0,'"+name+"','"+email+"','"+dept+"',"+sal+")");
					
			
			
			if(i>0)
			{
				System.out.println("data inserted....");
			}
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}

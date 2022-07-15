package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id : ");
		int id = sc.nextInt();
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
			
		PreparedStatement ps = cn.prepareStatement("update emp set name=?,email=?,dept=?,sal=? where id=?");
		ps.setInt(5, id);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, dept);			
		ps.setDouble(4, sal);		
		int i =  ps.executeUpdate();
			
					
			
			
			if(i>0)
			{
				System.out.println("data updated....");
			}
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}

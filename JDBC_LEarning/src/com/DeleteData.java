package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id : ");
		int id = sc.nextInt();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/27jan";
			String uname = "root";
			String pass = "";
			
			Connection cn = DriverManager.getConnection(url,uname,pass);
			
		PreparedStatement ps = cn.prepareStatement("delete from emp where id=?");
		ps.setInt(1, id);
				
		int i =  ps.executeUpdate();
			
					
			
			
			if(i>0)
			{
				System.out.println("data deleted.......");
			}
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}

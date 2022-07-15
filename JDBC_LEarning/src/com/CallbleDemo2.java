package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CallbleDemo2
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name : ");
		String bname = sc.next();
		System.out.println("Enter book price : ");
		double price = sc.nextDouble();
		System.out.println("Enter qty : ");
		int qty = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/27jan";
			String uname = "root";
			String pass = "";
			Connection cn = DriverManager.getConnection(url,uname,pass);

			CallableStatement ps= cn.prepareCall("call addbook(?,?,?)");
			ps.setString(1, bname);
			ps.setDouble(2, price);
			ps.setInt(3, qty);
			
			ps.execute();
			System.out.println("Data inseterd..");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}

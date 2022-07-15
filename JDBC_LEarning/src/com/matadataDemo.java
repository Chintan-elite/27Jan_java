package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import com.mysql.cj.conf.ConnectionUrl.Type;

public class matadataDemo
{
	public static void main(String[] args) {
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/27jan";
			String uname = "root";
			String pass = "";
			Connection cn = DriverManager.getConnection(url,uname,pass);

		    
			DatabaseMetaData db = cn.getMetaData();
			//System.out.println(db.getDatabaseProductName());
			//System.out.println(db.getDatabaseMajorVersion());
			
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from library");
			
			ResultSetMetaData rmt = rs.getMetaData();
			System.out.println(rmt.getColumnCount());
			System.out.println(rmt.getColumnName(1));
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}

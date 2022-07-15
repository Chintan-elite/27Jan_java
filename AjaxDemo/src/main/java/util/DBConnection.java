package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	public static Connection getConn()
	{
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/27jan","root","");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
	}
}

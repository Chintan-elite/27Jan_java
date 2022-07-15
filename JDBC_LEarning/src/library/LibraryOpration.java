package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LibraryOpration {

	Connection cn;
	public LibraryOpration() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/27jan";
			String uname = "root";
			String pass = "";
			cn = DriverManager.getConnection(url,uname,pass);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	Scanner sc = new Scanner(System.in);
	public void addBook()
	{
		try {
			
			System.out.println("Enter book name : ");
			String bname = sc.next();
			PreparedStatement ps1 = cn.prepareStatement("select * from library where bname=?");
			ps1.setString(1, bname);
			ResultSet rs =   ps1.executeQuery();
			if(rs.next())
			{
				System.out.println("Book alredy exist!!!");
			}
			else
			{
				System.out.println("Enter book price : ");
				double price = sc.nextDouble();
				System.out.println("Enter qty : ");
				int qty = sc.nextInt();
				PreparedStatement ps = cn.prepareStatement("insert into library values(?,?,?,?)");
				ps.setInt(1, 0);
				ps.setString(2, bname);
				ps.setDouble(3, price);
				ps.setInt(4, qty);
				int i = ps.executeUpdate();
				if(i>0)
				{
					System.out.println("Book inserted !!!");
				}
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void viewBook()
	{
		
		try {
			PreparedStatement ps = cn.prepareStatement("select * from library");
			ResultSet rs =   ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void deleteBook() 
	{
		try {
			
			System.out.println("Enter book name : ");
			String bname = sc.next();
			PreparedStatement ps1 = cn.prepareStatement("select * from library where bname=?");
			ps1.setString(1, bname);
			ResultSet rs =   ps1.executeQuery();
			if(rs.next())
			{
				
				PreparedStatement ps = cn.prepareStatement("delete from library where bname=?");
				ps.setString(1, bname);
				
				int i = ps.executeUpdate();
				if(i>0)
				{
					System.out.println("Book Deleted !!!");
				}
			}
			else
			{
				System.out.println("Book not available!!");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void issueBook()
	{
		
		try {
			
			System.out.println("Enter book name : ");
			String bname = sc.next();
			PreparedStatement ps1 = cn.prepareStatement("select * from library where bname=?");
			ps1.setString(1, bname);
			ResultSet rs =   ps1.executeQuery();
			if(rs.next())
			{
				int qty = rs.getInt(4);
				if(qty>0)
				{
					qty--;
					PreparedStatement ps = cn.prepareStatement("update library set qty=? where bname=?");
					ps.setInt(1, qty);
					ps.setString(2, bname);
					int i = ps.executeUpdate();
					if(i>0)
					{
						System.out.println("Book Issued !!!");
					}
				}
				else
				{
					System.out.println("book is currently not availble!!!");
				}
			}
			else
			{
				System.out.println("Book not available!!!");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
}

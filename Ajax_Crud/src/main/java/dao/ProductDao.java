package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Product;
import util.CreateConnection;

public class ProductDao {
	
	Connection cn;
	public ProductDao() {
		CreateConnection con = new CreateConnection();
		cn  =con.mkConn();
	}
	public int addProduct(Product p) {
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("insert into prod values(?,?,?)");
			ps.setInt(1,0);
			ps.setString(2, p.getPname());
			ps.setDouble(3, p.getPrice());
			
			i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public boolean isExist(Product p) {
		boolean b = false;
		try {
			PreparedStatement ps = cn.prepareStatement("select * from prod where pname=?");
			ps.setString(1, p.getPname());
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				b = true;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	
	
	public ArrayList<Product> getAllProduct()
	{
		ArrayList<Product> al = new ArrayList<Product>();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from prod");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Product p1 = new Product();
				p1.setPid(rs.getInt(1));
				p1.setPname(rs.getString(2));
				p1.setPrice(rs.getDouble(3));
				
				al.add(p1);
				
			}
		
		
		} catch (SQLException e) {
	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return al;
	}
	public int deleteProduct(int uid)
	{
		int i = 0;
		try {
			PreparedStatement ps = cn.prepareStatement("delete from prod where pid=?");
			ps.setInt(1, uid);
			i = ps.executeUpdate();
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public Product getProdById(int uid) {
		
		Product p1 = new Product();
		String qry = "select * from prod where pid=?";
		try {
			PreparedStatement ps = cn.prepareStatement(qry);
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				p1.setPid(rs.getInt(1));
				p1.setPname(rs.getString(2));
				p1.setPrice(rs.getDouble(3));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p1;
	}
	public int editProduct(Product p) {
		
		int i = 0;
		try {
			
			String qry = "update prod set pname=?, price=? where pid=?";
			PreparedStatement ps = cn.prepareStatement(qry);
			ps.setInt(3,p.getPid());
			ps.setString(1, p.getPname());
			ps.setDouble(2, p.getPrice());
			
			i = ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public ArrayList<Product> getSearchProduct(String pname) {
		ArrayList<Product> al = new ArrayList<Product>();
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from prod where pname like '"+pname+"%'");
		
			while(rs.next())
			{
				Product p1 = new Product();
				p1.setPid(rs.getInt(1));
				p1.setPname(rs.getString(2));
				p1.setPrice(rs.getDouble(3));
				
				al.add(p1);
				
			}
		
		
		} catch (SQLException e) {
	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
		
	}
	
	
}

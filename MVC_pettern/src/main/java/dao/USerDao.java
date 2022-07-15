package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;
import util.DBConnection;

public class USerDao 
{
	Connection cn;
	public USerDao() {
		
		 cn = DBConnection.getConn();
	}
	
	public String loginCheck(User u)
	{
		String user = null;
		try {
			PreparedStatement ps= cn.prepareStatement("select * from user where uname=? and pass=?");
			ps.setString(1, u.getUname());
			ps.setString(2, u.getPass());
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				user = rs.getString(2);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	

	public ArrayList<User> getAllUser()
	{
		ArrayList<User> al = new ArrayList();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from user");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				User u = new User();
				u.setUid(rs.getInt(1));
				u.setUname(rs.getString(2));
				u.setPass(rs.getString(3));
				
				al.add(u);
				
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al;
	}

	public int addUser(User u) {
		int i=0;
		try {
			PreparedStatement ps = cn.prepareStatement("insert into user values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, u.getUname());
			ps.setString(3, u.getPass());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return i;
	}

	public int deleteUser(int uid) {
		int i=0;
		try {
			PreparedStatement ps = cn.prepareStatement("delete from user where uid=?");
			ps.setInt(1, uid);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public User getDataById(int uid)
	{
		User u = new User();
		try {
			PreparedStatement ps = cn.prepareStatement("select * from user where uid=?");
			ps.setInt(1, uid);
			ResultSet rs= ps.executeQuery();
			if(rs.next())
			{
				u.setUid(rs.getInt(1));
				u.setUname(rs.getString(2));
				u.setPass(rs.getString(3));
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	public int editUser(User u) {
		
		int i=0;
		try {
			PreparedStatement ps = cn.prepareStatement("update user set uname=?, pass=? where uid=?");
			ps.setInt(3, u.getUid());
			ps.setString(1, u.getUname());
			ps.setString(2, u.getPass());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	
	
}
	
	
	

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import util.CreateConnection;

public class UserDao {
	Connection cn;
	public UserDao() {
		CreateConnection con = new CreateConnection();
		cn  =con.mkConn();
	}
	
	public boolean loginCheck(User ud) {
		
		boolean b = false;
		try {
			PreparedStatement ps = cn.prepareStatement("select * from user where uname=? and pass=?");
			ps.setString(1, ud.getUname());
			ps.setString(2, ud.getPass());
			
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
}

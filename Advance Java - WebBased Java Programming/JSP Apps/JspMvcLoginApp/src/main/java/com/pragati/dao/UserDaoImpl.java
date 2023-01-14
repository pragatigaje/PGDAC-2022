package com.pragati.dao;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pragati.conn.MyConn;
import com.pragati.model.User;

public class UserDaoImpl implements UserDao{
	
	private MyConn myConn;
	
	public UserDaoImpl() {
		myConn = new MyConn();
	}

	@Override
	public void save(User user) {
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("insert into user (uname,upass) values (?,?)");
			s.setString(1, user.getUname());
			s.setString(2, user.getUpass());
			int i = s.executeUpdate();
			s.close();
			con.close();	
		}catch (Exception e) {
			e.printStackTrace();
		}			
	}

	@Override
	public Boolean login(User user) {
		boolean flag = false;
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("select * from user where uname = ? and upass = ?");
			s.setString(1, user.getUname());
			s.setString(2, user.getUpass());
			ResultSet rs = s.executeQuery();
			if(rs.next()){
				user.setUid(rs.getInt(1));
				user.setUname(rs.getString(2));
				user.setImage(rs.getString(4));
				flag = true;
			}
			s.close();
			con.close();	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public void upload(int uid, String image) {
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("update user set image = ? where uid = ?");
			s.setString(1, image);
			s.setInt(2, uid);
			int i = s.executeUpdate();
			s.close();
			con.close();	
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}

}

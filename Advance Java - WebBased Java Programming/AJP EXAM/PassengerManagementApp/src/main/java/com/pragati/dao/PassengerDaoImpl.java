package com.pragati.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pragati.conn.MyConn;
import com.pragati.model.Passenger;

public class PassengerDaoImpl implements PassengerDao{

	private MyConn myConn;
	
	public PassengerDaoImpl() {
		myConn = new MyConn();
	}

	@Override
	public void save(Passenger passenger) {
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("insert into passenger(name,gender,country,about,maillist) values (?,?,?,?,?)");
			s.setString(1, passenger.getName());	
			s.setString(2, passenger.getGender());	
			s.setString(3, passenger.getCountry());	
			s.setString(4, passenger.getAbout());	
			s.setString(5, passenger.getMaillist());	
			
			s.executeUpdate();
			s.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Passenger> selectAll(int uid) {
		List<Passenger> lst = new ArrayList<Passenger>();
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("select * from passenger where uid = ? order by name");
			s.setInt(1, uid);	
			ResultSet rs = s.executeQuery();
			
			while(rs.next()) {
				Passenger passenger = new Passenger();
				passenger.setId(rs.getInt(1));
				passenger.setUid(rs.getInt(2));
				passenger.setName(rs.getString(3));
				passenger.setGender(rs.getString(4));
				passenger.setCountry(rs.getString(5));
				passenger.setAbout(rs.getString(6));
				passenger.setMaillist(rs.getString(7));
				lst.add(passenger);
			}
			s.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public void deleteById(int id) {
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("delete from passenger where id = ?");
			s.setInt(1, id);
			s.executeUpdate();
			s.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public Passenger selectById(int id) {
		Passenger passenger = new Passenger();
		
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("select * from passenger where id = ?");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				passenger.setId(rs.getInt(1));
				passenger.setUid(rs.getInt(2));
				passenger.setName(rs.getString(3));
				passenger.setGender(rs.getString(4));
				passenger.setCountry(rs.getString(5));
				passenger.setAbout(rs.getString(6));
				passenger.setMaillist(rs.getString(7));
			}
			s.close();
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return passenger;
	}

	@Override
	public void update(Passenger passenger) {
		try {
			Connection con = myConn.getConn();
			PreparedStatement s = con.prepareStatement("update passenger set name=?,gender=?,country=?,about=?,maillist=? where id=?");
			s.setString(1, passenger.getName());	
			s.setString(2, passenger.getGender());	
			s.setString(3, passenger.getCountry());	
			s.setString(4, passenger.getAbout());	
			s.setString(5, passenger.getMaillist());	
			
			s.executeUpdate();
			s.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
package com.sarje.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sarje.model.Car;

@Repository
public class CarDaoImpl implements CarDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save(Car car) {
		jdbcTemplate.update("insert into Car(make,model,price) values(?,?,?)",new Object[] {car.getMake(),car.getModel(),car.getPrice()});
	}

	@Override
	public void update(Car car) {
		jdbcTemplate.update("update Car set make = ?, model = ?, price = ? where id = ?",new Object[] {car.getMake(),car.getModel(),car.getPrice(),car.getId()});
	}

	@Override
	public void deleteById(int id) {
		jdbcTemplate.update("delete from Car where id = ?",new Object[] {id});
	}

	@Override
	public Car selectById(int id) {
		return jdbcTemplate.query("select * from Car where id = ?",new Object[] {id}, (rs,indx)->{
			Car car = new Car();
			car.setId(rs.getInt(1));
			car.setMake(rs.getString(2));
			car.setModel(rs.getString(3));
			car.setPrice(rs.getFloat(4)); 
			return car;
		}).get(0); 
		
	}

	@Override
	public List<Car> selectAll() {
		return jdbcTemplate.query("select * from Car", (rs,indx)->{
			Car car  = new Car();
			car.setId(rs.getInt(1));
			car.setMake(rs.getString(2));
			car.setModel(rs.getString(3));
			car.setPrice(rs.getFloat(4));
			return car;
		});
				
	}
	
}

package com.sarje.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sarje.model.Car;

@Repository
public class CarDaoImpl implements CarDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save(Car car) {
		jdbcTemplate.update("insert into Car(make,model,price) values('"+car.getMake()+"','"+car.getModel()+"',"+car.getPrice()+")");
	}

	@Override
	public void update(Car car) {
		jdbcTemplate.update("update Car set make = '"+car.getMake()+"', model = '"+car.getModel()+"', price = "+car.getPrice()+" where id = "+car.getId());
	}

	@Override
	public void deleteById(int id) {
		jdbcTemplate.update("delete from Car where id = "+id);
	}

	@Override
	public Car selectById(int id) {
		return jdbcTemplate.query("select * from Car where id = "+id, rs->{
			Car car = new Car();
			if(rs.next()) {
				car.setId(rs.getInt(1));
				car.setMake(rs.getString(2));
				car.setModel(rs.getString(3));
				car.setPrice(rs.getFloat(4)); 
			}
			return car;
		});
		
	}

	@Override
	public List<Car> selectAll() {
		return jdbcTemplate.query("select * from Car", rs->{
			List<Car> cars = new ArrayList<Car>();
			while(rs.next()) {
				Car car  = new Car();
				car.setId(rs.getInt(1));
				car.setMake(rs.getString(2));
				car.setModel(rs.getString(3));
				car.setPrice(rs.getFloat(4));
				cars.add(car);
			}
			return cars;
		});
	}
	
}

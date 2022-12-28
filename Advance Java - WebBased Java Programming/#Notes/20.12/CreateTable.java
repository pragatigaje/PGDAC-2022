package dec20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		try {
			// load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create connection
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sarje_java?useSSL=false","root","root");
			// create query statement
			Statement s = con.createStatement();
			// execute query
			boolean flag = s.execute("create table Student(rno int primary key,name varchar(25),marks float(10,2),dob date)");
			System.out.println(flag);
			// close statement
			s.close();
			// close connection
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");
		
	}

}

package ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Q1CreateTable {

	public static void main(String[] args) {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating a connection
			//In url add "?useSSL=false" to avoid security error it is kind certification for website
			String url = "jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username ="root";
			String password ="password";
			Connection con = DriverManager.getConnection(url, username,password);
			
			String qry = "create table student(rno int, name varchar(20), marks int, dob date)";
			
			Statement stmt = con.createStatement();
			
			stmt.execute(qry);
		
			System.out.println("Table created successfully");
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

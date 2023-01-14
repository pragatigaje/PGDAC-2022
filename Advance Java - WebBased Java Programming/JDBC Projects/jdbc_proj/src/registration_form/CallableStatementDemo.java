package registration_form;

import java.sql.*;
import java.util.Scanner;

public class CallableStatementDemo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username = "root";
			String password = "password";
			Connection con = DriverManager.getConnection(url,username,password);
			
			CallableStatement cst = con.prepareCall("{call addRow(?,?)}");
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter city");
			String city = sc.next();
			cst.setString(1, name);
			cst.setString(2, city);
			
			cst.executeUpdate();
			System.out.println("Insertion Successful!!!");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

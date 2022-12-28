package registration_form;

import java.sql.*;
import java.util.Scanner;
public class InsertRecord {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name and City ");
		String name = sc.nextLine();
		String city = sc.next();
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create a connection
			String url = "jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username ="root";
			String password ="password";
			Connection con = DriverManager.getConnection(url, username,password);
			
			Statement stmt = con.createStatement();		
			
			
			String qry = "insert into info (sname,city) values('"+name+"','"+city+"')";
			stmt.executeUpdate(qry);
			System.out.println("Inserted Successfully");
			
			con.close();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

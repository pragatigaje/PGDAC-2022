package registration_form;

import java.sql.*;
import java.util.Scanner;
public class PreparedStatementDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username = "root";
			String password = "password";
			Connection con = DriverManager.getConnection(url,username,password);
			
			String qry = "insert into info (sname, city) values (?,?)";
			PreparedStatement pst = con.prepareStatement(qry);
			
			while (true) {
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter city");
				String city = sc.next();
				
				pst.setString(1, name);
				pst.setString(2, city);
				
				pst.executeUpdate();
				
				System.out.println("DO YOU WANT TO CONTINUE ??? IF YES PRESS 1");
				int flag = sc.nextInt();
				if (flag != 1) {
					break;
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}

package ass;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Q11CallpPocedure {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username = "root";
			String password = "password";
			Connection con = DriverManager.getConnection(url,username,password);
			
			CallableStatement cst = con.prepareCall("{call insertRec(?,?,?,?)}");
			System.out.println("Enter Roll no ");
			int rno = sc.nextInt();	
			System.out.println("Enter name :");
			String name =sc.next();
			System.out.println("Enter Marks ");
			int marks = sc.nextInt();
			System.out.println("Enter dob :");
			String dob =sc.next();
			
			cst.setInt(1, rno);
			cst.setString(2, name);
			cst.setInt(3, marks);
			cst.setString(4, dob);
			
			cst.executeUpdate();
			System.out.println("Insertion Successful!!!");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

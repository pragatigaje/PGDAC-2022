package ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Q2InsertRecord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll no ");
		int rno = sc.nextInt();	
		System.out.println("Enter name :");
		String name =sc.next();
		System.out.println("Enter Marks ");
		int marks = sc.nextInt();
		System.out.println("Enter dob :");
		String dob =sc.next();
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create a connection
			String url = "jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username ="root";
			String password ="password";
			Connection con = DriverManager.getConnection(url, username,password);
			
			String qry = "insert into student values (?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(qry);
			
			pst.setInt(1, rno);
			pst.setString(2, name);
			pst.setInt(3, marks);
			pst.setString(4, dob);
			
			pst.executeUpdate();

			System.out.println("Inserted Successfully");
			con.close();
			pst.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

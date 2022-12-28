package dec21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rno");
		int rno = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter marks");
		float marks = sc.nextFloat();
		System.out.println("Enter dob yyyy-mm-dd");
		String dob = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sarje_java?useSSL=false","root","root");
			PreparedStatement s = con.prepareStatement("insert into Student values(?,?,?,?)");
			s.setInt(1, rno);
			s.setString(2, name);
			s.setFloat(3, marks);
			s.setString(4, dob);
			int i = s.executeUpdate();
			System.out.println(i+" rows inserted");
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");
		
	}

}

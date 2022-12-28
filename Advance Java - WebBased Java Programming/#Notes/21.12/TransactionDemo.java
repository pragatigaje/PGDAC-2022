package dec21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionDemo {

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
			
			con.setAutoCommit(false);
			
			PreparedStatement s = con.prepareStatement("update Student set name = ?, marks = ?,dob = ? where rno = ?");
			s.setString(1, name);
			s.setFloat(2, marks);
			s.setString(3, dob);
			s.setInt(4, rno);
			int i = s.executeUpdate();
			
			con.commit();
			System.out.println(i+" rows updated");
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");
		
	}

}

package dec21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rno");
		int rno = sc.nextInt();
		System.out.println("Enter class");
		int sclass = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sarje_java?useSSL=false","root","root");
			Statement s = con.createStatement();
			int i = s.executeUpdate("update Student set sclass = "+sclass+" where rno = "+rno);
			System.out.println(i+" rows updated");
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");
		
	}

}

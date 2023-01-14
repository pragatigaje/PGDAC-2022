package ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q9CRUD__Operation {
	
	private static void read(Connection con) throws SQLException {
		String qry ="select * from student";
		PreparedStatement pst = con.prepareStatement(qry);
		ResultSet set = pst.executeQuery(qry);
		
		while (set.next()) {
			int rno = set.getInt(1);
			String name = set.getString(2);
			int marks = set.getInt(3);
			String dob = set.getString(4);
			
			System.out.println(rno+" "+name+" "+marks+" "+dob);
		}
	}
	
	private static void update(Connection con,Scanner sc) throws SQLException {

		System.out.println("Enter Roll no ");
		int rno = sc.nextInt();		
		System.out.println("Enter Marks ");
		int marks = sc.nextInt();
		String qry ="update student set marks="+marks+" where rno="+rno+"";
		PreparedStatement pst = con.prepareStatement(qry);
		pst.execute();	
	}
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username ="root";
			String password ="password";
			Connection con = DriverManager.getConnection(url, username,password);

			System.out.println("Enter opeation no 1:Read 2.Update 3.Delete");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: 
				read(con);
				break;
			case 2:
				update(con,sc);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//create a connection

	}

}

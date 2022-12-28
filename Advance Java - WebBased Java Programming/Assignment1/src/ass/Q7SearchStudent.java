package ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q7SearchStudent {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Roll no ");
		int roll = sc.nextInt();	
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username ="root";
			String password ="password";
			Connection con =DriverManager.getConnection(url,username,password);

			Statement stmt = con.createStatement();
			String qry ="select * from student";
			ResultSet set = stmt.executeQuery(qry);

			while (set.next()) {
				int rno = set.getInt(1);
				String name = set.getString(2);
				int marks = set.getInt(3);
				String dob = set.getString(4);
				if(rno == roll) {
					System.out.println(rno+" "+name+"	"+marks+"	"+dob);		
				}
			}
		} catch (SQLException| ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

package ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q8DisplayAverage {
	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username ="root";
			String password ="password";
			Connection con =DriverManager.getConnection(url,username,password);

			Statement stmt = con.createStatement();
			String qry ="select sum(marks)/count(*) from student";
			ResultSet set = stmt.executeQuery(qry);
			while (set.next()) {
				Float avg = set.getFloat(1);
				
				System.out.println("The avearage marks : "+avg);
			}

		} catch (SQLException| ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
	



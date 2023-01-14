package ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q5PrintNoOfStudent {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username ="root";
			String password ="password";
			Connection con =DriverManager.getConnection(url,username,password);

			Statement stmt = con.createStatement();
			String qry ="select count(*) from student";
			ResultSet set = stmt.executeQuery(qry);
			while (set.next()) {
				int count = set.getInt(1);
				
				System.out.println(count);
			}

		} catch (SQLException| ClassNotFoundException e) {
			e.printStackTrace();
		}


	}

}

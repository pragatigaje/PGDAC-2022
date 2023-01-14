package ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q4SortByMarks {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username ="root";
			String password ="password";
			Connection con =DriverManager.getConnection(url,username,password);

			Statement stmt = con.createStatement();
			String qry ="select * from student order by marks desc";
			ResultSet set = stmt.executeQuery(qry);

			while (set.next()) {
				int rno = set.getInt(1);
				String name = set.getString(2);
				int marks = set.getInt(3);
				String dob = set.getString(4);

				System.out.println(rno+"  "+name+"	"+marks+"	"+dob);
			}
		} catch (SQLException| ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

package registration_form;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrintRecord {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username ="root";
			String password ="password";
			Connection con =DriverManager.getConnection(url,username,password);
			
			Statement stmt = con.createStatement();
			String qry ="select * from info";
			ResultSet set = stmt.executeQuery(qry);
			
			while (set.next()) {
				int id = set.getInt(1);
				String sname = set.getString(2);
				String city= set.getString(3);
				System.out.println(id+" "+sname+" "+city);
				
			}
		} catch (SQLException| ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

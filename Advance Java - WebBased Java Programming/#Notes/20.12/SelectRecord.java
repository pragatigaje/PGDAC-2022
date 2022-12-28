package dec20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecord {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sarje_java?useSSL=false","root","root");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select * from Student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
			}
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");
		
	}

}

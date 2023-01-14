package ass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Q10NoOfCol {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username = "root";
			String password = "password";
			Connection con = DriverManager.getConnection(url,username,password); 
			
			PreparedStatement pst = con.prepareStatement("select * from info");
			ResultSet rs = pst.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("No Of Columns : "+rsmd.getColumnCount());
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}

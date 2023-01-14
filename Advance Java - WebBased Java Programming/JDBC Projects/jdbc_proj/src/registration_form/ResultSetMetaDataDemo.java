package registration_form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.sql.*;

public class ResultSetMetaDataDemo {

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
//			System.out.println(rsmd.getColumnCount());
			
			for(int i=1 ; i<=rsmd.getColumnCount();i++) {
				System.out.print(rsmd.getColumnName(i));
				System.out.print(" | ");
				System.out.print(rsmd.getColumnDisplaySize(i));
				System.out.print(" | ");
				System.out.print(rsmd.getColumnTypeName(i));
				System.out.println();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}

package dec21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class MetaDataDemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sarje_java?useSSL=false&allowPublicKeyRetrieval=true","root","root");
			PreparedStatement s = con.prepareStatement("select * from Student");
			ResultSet rs = s.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.println(rsmd.getColumnName(i));
				System.out.println(rsmd.getColumnDisplaySize(i));
				System.out.println(rsmd.getColumnTypeName(i)); 
			}
			
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");
		
	}

}

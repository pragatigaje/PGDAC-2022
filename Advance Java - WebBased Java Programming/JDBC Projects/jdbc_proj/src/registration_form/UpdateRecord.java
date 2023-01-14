package registration_form;

import java.sql.*;
import java.util.Scanner;

public class UpdateRecord {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username ="root";
			String password ="password";
			Connection con = DriverManager.getConnection(url,username,password);
			
			while(true) {
				System.out.println("Enter roll no of which marks to be update : ");
				int rn = sc.nextInt();
				System.out.println("Enter marks : ");
				int m = sc.nextInt();
				Statement stmt = con.createStatement();
				String qry = "update info set marks="+m+" where sId="+rn+"";
				stmt.execute(qry);
				System.out.println("Update successfully");	
				
				System.out.println("DO YOU WANT TO CONTINUE ??? IF YES PRESS 1");
				int flag = sc.nextInt();
				if (flag != 1) {
					System.out.println("Thank you, Bye!");
					break;
				}
			}
			
			con.close();
		} catch (SQLException| ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

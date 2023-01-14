package registration_form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetDemo {
	private static ResultSet rs;
	private static Scanner sc;
	
	private static void showRec() throws SQLException{
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
	}
	private static void showRecRev() throws SQLException {
		rs.afterLast();
		while(rs.previous()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));		
			}
	}
	
	private static void firstRecord() throws SQLException {
		if(rs.first()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
	}
	
	private static void lastRecord() throws SQLException {
		if(rs.last()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
	}
	
	private static void insertRec() throws SQLException {
		System.out.println("Enter Roll no");
		int no = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter City");
		String city = sc.next();
		System.out.println("Enter Marks");
		int marks = sc.nextInt();
		rs.moveToInsertRow();
		rs.updateInt(1, no);
		rs.updateString(2, name);
		rs.updateString(3, city);
		rs.updateInt(4, marks);
		rs.insertRow();
		rs.moveToCurrentRow();
				
	}
	private static void updateRec() throws SQLException {
		System.out.println("Enter roll no");
		int no = sc.nextInt();
		boolean flag = false;
		rs.beforeFirst();
		while(rs.next()) {
			if(rs.getInt(1)==no) {
				System.out.println("Enter Name");
				String name = sc.next();
				System.out.println("Enter City");
				String city = sc.next();
				System.out.println("Enter Marks");
				int marks = sc.nextInt();
				rs.updateString(2, name);
				rs.updateString(3, city);
				rs.updateInt(4, marks);
				
				rs.updateRow();
				rs.moveToCurrentRow();
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("record not found");
		}
		
	}
	private static void deleteRec() throws SQLException {
		System.out.println("Enter roll no");
		int no = sc.nextInt();
		boolean flag = false;
		rs.beforeFirst();
		while(rs.next()) {
			if(rs.getInt(1)==no) {
				rs.deleteRow();
				rs.moveToCurrentRow();
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("record not found");
		}
	}
	
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
			String username ="root";
			String password ="password";
			Connection con =DriverManager.getConnection(url,username,password);
			
			PreparedStatement stmt = con.prepareStatement("select * from info",
			ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery();
			
			sc = new Scanner(System.in);
			boolean flag =true;
				do {
					System.out.println("Enter no for operation 0:Exit 1:Shoe Record 2:Show Record in reverse 3:first rec 4:Last rec 5:Insert Rec 6:Update Rec 7:Delete Rec");
					byte ch = sc.nextByte();
					switch (ch) {
					case 0:
						flag=false;
						break;
					case 1:
						showRec();
						break;
					case 2:
						showRecRev();
						break;
					case 3:
						firstRecord();
						break;
					case 4:
						lastRecord();
						break;
					case 5:
						insertRec();
						break;
					case 6:
						updateRec();
						break;
					case 7:
						deleteRec();
						break;
					default:
						System.out.println("Wrong Choice");
					
				} }while (flag);
				
			}catch (SQLException| ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
  
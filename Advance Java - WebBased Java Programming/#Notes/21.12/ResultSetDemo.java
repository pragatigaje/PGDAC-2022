package dec21;

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

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sarje_java?useSSL=false&allowPublicKeyRetrieval=true","root","root");
			PreparedStatement s = con.prepareStatement("select * from Student",
					ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = s.executeQuery();
			sc = new Scanner(System.in);
			boolean flag = true;
			do {
				System.out.println("0 to exit");
				System.out.println("1 to show record");
				System.out.println("2 to show record rev");
				System.out.println("3 to show first record");
				System.out.println("4 to show last record");
				System.out.println("5 to insert record");
				System.out.println("6 to update record");
				System.out.println("7 to delete record");
				byte ch = sc.nextByte();
				switch(ch) {
					case 0 :
						flag = false;
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
						System.out.println("wrong choice");
						
				}
				
			}while(flag);
			
			
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");
		
	}
	
	private static void showRec() throws SQLException {
		rs.beforeFirst();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
		}
	}

	private static void showRecRev() throws SQLException {
		rs.afterLast();
		while(rs.previous()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
		}
	}
	
	private static void firstRecord() throws SQLException {
		if(rs.first()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
		}
	}
	
	private static void lastRecord() throws SQLException {
		if(rs.last()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
		}
	}
	
	private static void insertRec() throws SQLException {
		System.out.println("Enter rno");
		int rno = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter marks");
		float marks = sc.nextFloat();
		System.out.println("Enter dob");
		String dob = sc.next();
		rs.moveToInsertRow();
		rs.updateInt(1, rno);
		rs.updateString(2, name);
		rs.updateFloat(3, marks);
		rs.updateString(4, dob);
		rs.insertRow();
		rs.moveToCurrentRow();
	}
	
	
	private static void updateRec() throws SQLException {
		System.out.println("Enter rno");
		int rno = sc.nextInt();
		boolean flag = false;
		rs.beforeFirst();
		while(rs.next()) {
			if(rs.getInt(1)==rno) {
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter marks");
				float marks = sc.nextFloat();
				System.out.println("Enter dob");
				String dob = sc.next();
				
				rs.updateString(2, name);
				rs.updateFloat(3, marks);
				rs.updateString(4, dob);
				
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
		System.out.println("Enter rno");
		int rno = sc.nextInt();
		boolean flag = false;
		rs.beforeFirst();
		while(rs.next()) {
			if(rs.getInt(1)==rno) {
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
}

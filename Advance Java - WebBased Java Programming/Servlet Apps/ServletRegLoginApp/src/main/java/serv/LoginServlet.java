package serv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String unm = request.getParameter("uname");
		String pass = request.getParameter("upass");
		
		boolean flag = false;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac_db?useSSL=false","root","password");
			PreparedStatement pst = con.prepareStatement("select * from users where uname = ? and upass = ?");
			
			pst.setString(1, unm);
			pst.setString(2, pass);
			
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag=true;				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (flag) {
			response.sendRedirect("HomeServlet");
		}else {
			response.sendRedirect("login.html");
		}
	}

}

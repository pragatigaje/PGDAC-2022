<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.mysql.cj.jdbc.Driver"%>
<%@page import="java.sql.Connection"%>
<%
	String unm = request.getParameter("uname");
	String pass = request.getParameter("upass");
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String url = "jdbc:mysql://localhost:3306/cdac_db?useSSL=false";
	String username ="root";
	String password ="password";
	Connection con = DriverManager.getConnection(url,username,password);
	
	PreparedStatement s = con.prepareStatement("insert into users values(?,?)");
	s.setString(1, unm);
	s.setString(2, pass);
	int i = s.executeUpdate();
	s.close();
	con.close();
	response.sendRedirect("login_from.jsp");
	

%>
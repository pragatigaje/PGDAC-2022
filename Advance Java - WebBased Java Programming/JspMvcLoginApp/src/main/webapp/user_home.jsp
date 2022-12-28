<%@page import="com.pragati.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%
 	User user =(User)session.getAttribute("user");
 if(user!=null && user.getUname()!=null){
 %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%@include file="user_menu.jsp" %>
	<div>
		<h1>Welcome Home <%=user.getUname() %></h1>
	</div>
</body>
</html>
<%
 }else
 {
	 response.sendRedirect("user_login_form.jsp");
 }
%>
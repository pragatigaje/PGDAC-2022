<%@page import="com.pragati.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file="cache_control_page.jsp" %>
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
	<div class="container text-center">
		<h1 class="text-center">Welcome <%=user.getUname() %></h1>
	<br>
		<img alt="no image" src="images/<%=user.getImage()%>" width="150">
		<a href="user_upload_form.jsp"><button class="btn btn-dark">Upload Profile</button></a>
	</div>
</body>
</html>
<%
 }else
 {
	 response.sendRedirect("logout.jsp");
 }
%>
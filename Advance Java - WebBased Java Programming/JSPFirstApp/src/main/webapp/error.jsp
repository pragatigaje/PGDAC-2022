<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body>
	<%@include file="Header.jsp" %>
	<h1 style="color:red"><%= exception.getLocalizedMessage() %></h1>
</body>
</html>
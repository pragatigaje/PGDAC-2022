<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Division</title>
</head>
<body>
	<%@include file="Header.jsp" %>
	<form action="div.jsp">
		<div>
			<label>Num1</label>
			<input type="text" name="num1">
		</div>	
		<div>
			<label>Num2</label>
			<input type="text" name="num2">
		</div>	
		<button type="submit">Divide</button>
	</form>
</body>
</html>
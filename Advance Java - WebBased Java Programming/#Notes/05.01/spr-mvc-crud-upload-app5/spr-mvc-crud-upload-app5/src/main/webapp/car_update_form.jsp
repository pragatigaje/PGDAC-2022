<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Car Update Form</title>
</head>
<body>
	<spr:form action="car_update.htm" commandName="car" method="post" >
		<spr:hidden path="id" />
		<div>
			<label>Make:</label>
			<spr:input path="make"/>
		</div>
		<div>
			<label>Model:</label>
			<spr:input path="model"/>
		</div>
		
		<div>
			<label>Price:</label>
			<spr:input path="price"/>
		</div>
		<spr:button>Update</spr:button>
	</spr:form>
</body>
</html>
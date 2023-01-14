<%@page import="com.sarje.model.Car"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% List<Car> lst = (List<Car>)request.getAttribute("cars");%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Make</th>
				<th>Model</th>
				<th>Price</th>
				<th>Delete</th>
				<th>Update</th>
				<th>Upload</th>
			</tr>
		</thead>
		<tbody>
			<% for(Car car : lst){ %>
				<tr>
					<td><%=car.getMake()%></td> 
					<td><%=car.getModel()%></td>
					<td><%=car.getPrice()%></td>
					<td><a href="car_delete.htm?id=<%=car.getId()%>" >Delete</a></td>
					<td><a href="car_update_form.htm?id=<%=car.getId()%>" >Update</a></td>
					<td><a href="car_upload.jsp?id=<%=car.getId()%>" >
						<img alt="no image" src="images/<%=car.getImage()%>" width="50" height="50" > 
					</a></td>
				</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>
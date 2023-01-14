<%@page import="com.pragati.model.Car"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% List<Car> lst = (List<Car>)request.getAttribute("cars"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car List</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<style>
	body{
		margin: 20px;
		left:50px;
		right:50px;
	    background: #bab9b9;
	    font-weight: bold;
	}
	.button{
		display: grid;
		height: 12px
	}
</style>
</head>
<body>
	<div class="alert alert-info text-center" role="alert">
		Car List
	</div>
	
<table class="table table-dark table-striped">
  <thead>
    <tr>
      <th scope="col">Make</th>
      <th scope="col">Model</th>
      <th scope="col">Price</th>
      <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
    <% for(Car car : lst){ %>
    	<tr>
    		<td class="table-light"><%=car.getMake()%></td>
    		<td class="table-light"><%=car.getModel()%></td>
    		<td class="table-light"><%=car.getPrice()%></td>
    		<td class="text-center"><a href="car_delete.htm?id=<%= car.getId()%>">Delete</a></td>
    		<td class="text-center"><a href="car_update_form.htm?id=<%= car.getId()%>">Update</a></td>
    	</tr>
    	<% } %>
  </tbody>
</table>
</body>
</html>
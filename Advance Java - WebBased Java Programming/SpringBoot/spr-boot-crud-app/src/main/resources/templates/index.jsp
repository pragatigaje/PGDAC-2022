<%@page import="com.pragati.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.pragati.service.ProductServiceImpl"%>
<%@page import="com.pragati.service.ProductService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% 
	ProductService productService= new ProductServiceImpl();
	List<Product> products = productService.getAll();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
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
	<body>
	<div class="alert alert-info text-center" role="alert">
		Product
	</div>
	
<table class="table table-dark table-striped">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Price</th>
      <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
    <% for(Product product : products){ %>
    	<tr>
    		<td class="table-light"><%=product.getName()%></td>
    		<td class="table-light"><%=product.getPrice()%></td>
    		<td class="text-center"><a href="expense_delete.jsp?id=<%=product.getId()%>">Delete</a></td>
    		<td class="text-center"><a href="expense_update_form.jsp?id=<%=product.getId()%>">Update</a></td>
    	</tr>
    <% } %>
  </tbody>
</table>
</body>
</html>
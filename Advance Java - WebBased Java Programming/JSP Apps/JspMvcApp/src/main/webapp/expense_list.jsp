<%@page import="java.util.List"%>
<%@page import="com.pragati.service.ExpenseServiceImpl"%>
<%@page import="com.pragati.service.ExpenseService"%>
<%@page import="com.pragati.model.Expense"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	ExpenseService expenseService = new ExpenseServiceImpl();
	List<Expense> expenses = expenseService.getAll(0);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ExpenseList</title>
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
	<div class="alert alert-info text-center fs-2" role="alert">
		My Expense App
	</div>
	
<table class="table table-dark table-striped">
  <thead>
    <tr>
      <th scope="col">Item</th>
      <th scope="col">Price</th>
      <th scope="col">Quantity</th>
      <th scope="col">Date</th>
      <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
    <% for(Expense expense : expenses){ %>
    	<tr>
    		<td class="table-light"><%=expense.getItem()%></td>
    		<td class="table-light"><%=expense.getPrice()%></td>
    		<td class="table-light"><%=expense.getQuantity()%></td>
    		<td class="table-light"><%=expense.getEdate()%></td>
    		<td class="text-center"><a href="expense_delete.jsp?id=<%=expense.getId()%>">Delete</a></td>
    		<td class="text-center"><a href="expense_update_form.jsp?id=<%=expense.getId()%>">Update</a></td>
    	</tr>
    	<% } %>
  </tbody>
</table>
	<div class="button">
		<button type="submit" class="btn btn-dark text-center"><a href="expense_add_form.jsp">Add</a></button>
	</div>
</body>
</html>
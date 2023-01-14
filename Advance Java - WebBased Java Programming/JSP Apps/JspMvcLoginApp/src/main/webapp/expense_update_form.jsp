<%@page import="com.pragati.model.User"%>
<%@page import="com.pragati.model.Expense"%>
<%@page import="com.pragati.service.ExpenseServiceImpl"%>
<%@page import="com.pragati.service.ExpenseService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@include file="cache_control_page.jsp" %>
 <%
 	User user =(User)session.getAttribute("user");
 if(user!=null && user.getUname()!=null){
 %>
<%	
	String p1 = request.getParameter("id");
	int id = Integer.parseInt(p1);
	ExpenseService expenseService = new ExpenseServiceImpl();
	Expense expense = expenseService.getById(id);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense Update</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<style>
	body{
		margin: 160px;
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
	<%@include file="user_menu.jsp" %>
	<div class="alert alert-info text-center" role="alert">
		My Expense App
	</div>
	request is send to expense_add.jsp because of action tag
	<form action="expense_update.jsp" method="post">
		<input type="hidden" name="id" value="<%=expense.getId()%>">
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Item : </label>
		  <input type="text" class="form-control" id="exampleFormControlInput1" value="<%=expense.getItem()%>" placeholder="Enter Item Name" name="item">
		</div>
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Price : </label>
		  <input type="text" class="form-control" id="exampleFormControlInput1" value="<%=expense.getPrice()%>" placeholder="Enter Item price" name="price">
		</div>
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Quantity : </label>
		  <input type="text" class="form-control" id="exampleFormControlInput1" value="<%=expense.getQuantity()%>" placeholder="Enter Item quantity" name="quantity">
		</div>
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Date : </label>
		  <input type="text" class="form-control" id="exampleFormControlInput1" value="<%=expense.getEdate()%>"placeholder="Enter Date" name="edate">
		</div>
		<br>
		<div class="button">
			<button type="submit" class="btn btn-dark text-center">Update</button>
		</div>
	</form>
</body>
</html>
<%
 }else
 {
	 response.sendRedirect("logout.jsp");
 }
%>
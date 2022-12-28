<%@page import="com.sarje.model.Expense"%>
<%@page import="com.sarje.service.ExpenseServiceImpl"%>
<%@page import="com.sarje.service.ExpenseService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String p1 = request.getParameter("id");
	int id = Integer.parseInt(p1);
	ExpenseService expenseService = new ExpenseServiceImpl();
	Expense expense = expenseService.getById(id);

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense Add</title>
</head>
<body>
	<form action="expense_update.jsp" method="post" >
		<input type="hidden" name="id" value="<%=expense.getId()%>" >
		<div>
			<label>Item:</label>
			<input type="text" name="item" value="<%=expense.getItem()%>" >
		</div>
		<div>
			<label>Price:</label>
			<input type="text" name="price" value="<%=expense.getPrice()%>" >
		</div>
		<div>
			<label>Quantity:</label>
			<input type="text" name="quantity" value="<%=expense.getQuantity()%>" >
		</div>
		<div>
			<label>Date:</label>
			<input type="text" name="edate" value="<%=expense.getEdate()%>" >
		</div>
		<button type="submit" >Update</button>
	</form>
</body>
</html>
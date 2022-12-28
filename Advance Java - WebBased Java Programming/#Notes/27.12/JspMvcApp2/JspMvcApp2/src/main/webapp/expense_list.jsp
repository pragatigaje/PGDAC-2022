<%@page import="com.sarje.service.ExpenseServiceImpl"%>
<%@page import="com.sarje.service.ExpenseService"%>
<%@page import="com.sarje.model.Expense"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ExpenseService expenseService = new ExpenseServiceImpl();
	List<Expense> expenses = expenseService.getAll(0);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expense List</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Item</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Date</th>
				<th>Delete</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<% for(Expense expense : expenses){ %>
				<tr>
					<td><%=expense.getItem()%></td>
					<td><%=expense.getPrice()%></td>
					<td><%=expense.getQuantity()%></td> 
					<td><%=expense.getEdate()%></td>
					<td><a href="expense_delete.jsp?id=<%=expense.getId()%>" >Delete</a></td>
					<td><a href="expense_update_form.jsp?id=<%=expense.getId()%>" >Update</a></td>
				</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>
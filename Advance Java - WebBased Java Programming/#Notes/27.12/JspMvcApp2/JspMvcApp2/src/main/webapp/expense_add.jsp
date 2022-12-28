<%@page import="com.sarje.service.ExpenseServiceImpl"%>
<%@page import="com.sarje.service.ExpenseService"%>

<jsp:useBean id="expense" class="com.sarje.model.Expense" ></jsp:useBean>
<jsp:setProperty property="*" name="expense"/>

<%
	ExpenseService expenseService = new ExpenseServiceImpl();
	expenseService.add(expense);
	response.sendRedirect("expense_add_form.jsp"); 
%>
<%@page import="javax.websocket.SendResult"%>
<%@page import="com.pragati.service.ExpenseServiceImpl"%>
<%@page import="com.pragati.service.ExpenseService"%>
<jsp:useBean id="expense" class="com.pragati.model.Expense"></jsp:useBean>
<jsp:setProperty property="*" name="expense"/>

<%
	ExpenseService expenseService = new ExpenseServiceImpl();
	expenseService.modify(expense);
	response.sendRedirect("expense_list.jsp");
%>
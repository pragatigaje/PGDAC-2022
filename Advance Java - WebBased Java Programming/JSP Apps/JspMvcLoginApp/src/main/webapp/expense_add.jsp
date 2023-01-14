<%@page import="com.pragati.model.User"%>
<%@page import="com.pragati.service.ExpenseServiceImpl"%>
<%@page import="com.pragati.service.ExpenseService"%>

//Bean object is created using useBean refered as expense (because of id ) 
<jsp:useBean id="expense" class="com.pragati.model.Expense" ></jsp:useBean>
//setproperty will save all parameters value into object properties and do type conversion if needed
<jsp:setProperty property="*" name="expense"/>

<%
	User user = (User)session.getAttribute("user");
	int uid= user.getUid();
	expense.setUid(uid);
	//Object of ExpenseService interface's implementing class using constructor
	//in  new ExpenseServiceImpl() constructor we have already created dao object
	ExpenseService expenseService = new ExpenseServiceImpl();
	//ExpenseDao object will be used to call add method while passing bean object containing all records enetred by user
	//control will go to add method of ExpenseServiceImpl.java
	expenseService.add(expense);
	response.sendRedirect("expense_add_form.jsp");
%>

	
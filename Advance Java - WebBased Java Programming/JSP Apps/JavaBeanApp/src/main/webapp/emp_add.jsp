<%@page import="model.Employee"%>
<%
	String p1= request.getParameter("eid");
	String p2= request.getParameter("ename");
	String p3= request.getParameter("sal");
	
	int empId = Integer.parseInt(p1);
	float salary = Float.parseFloat(p3);
	
	Employee emp = new Employee();
	emp.setEmpid(empId);
	emp.setEmpName(p2);
	emp.setSalary(salary);
	
	session.setAttribute("e", emp);
	response.sendRedirect("emp_info.jsp");
%>
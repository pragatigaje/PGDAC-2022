<%@page import="com.pragati.service.PassengerServiceImpl"%>
<%@page import="com.pragati.service.PassengerService"%>
<%
	String p1 = request.getParameter("id");
	int id = Integer.parseInt(p1);
	PassengerService passengerService = new PassengerServiceImpl();
	passengerService.removeById(id);
	response.sendRedirect("passenger_add_form.jsp");
%>
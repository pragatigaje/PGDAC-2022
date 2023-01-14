<%@page import="com.pragati.service.PassengerServiceImpl"%>
<%@page import="com.pragati.service.PassengerService"%>
<jsp:useBean id="passenger" class="com.pragati.model.Passenger"></jsp:useBean>
<jsp:setProperty property="*" name="passenger"/>

<%
	PassengerService passengerService = new PassengerServiceImpl();
	passengerService.add(passenger);
	response.sendRedirect("passenger_add_form.jsp");

%>
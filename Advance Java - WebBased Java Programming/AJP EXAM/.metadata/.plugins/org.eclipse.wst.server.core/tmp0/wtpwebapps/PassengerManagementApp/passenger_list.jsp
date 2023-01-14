<%@page import="java.util.List"%>
<%@page import="com.pragati.service.PassengerServiceImpl"%>
<%@page import="com.pragati.service.PassengerService"%>
<%@page import="com.pragati.model.Passenger"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	PassengerService passengerService = new PassengerServiceImpl();
	List<Passenger> passengers = passengerService.getAll(0);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">Name</th>
	      <th scope="col">Gender</th>
	      <th scope="col">Country</th>
	      <th scope="col">About You</th>
	      <th scope="col">Mailing List</th>
	      <th scope="col"></th>
	      <th scope="col"></th>
	    </tr>
	  </thead>
	  <tbody>
	  <%for (Passenger passenger : passengers){ %>
	    <tr>
	      <td><%=passenger.getName() %></td>
	      <td><%=passenger.getGender() %></td>
	      <td><%=passenger.getCountry() %></td>
	      <td><%=passenger.getAbout() %></td>
	      <td><%=passenger.getMaillist() %></td>
	      <td><a href="passenger_delete.jsp?id=<%=passenger.getId()%>">Delete</a></td>
	      <td><a href="passenger_update.jsp?id=<%=passenger.getId()%>">Update</a></td>
	    </tr>
	   <%} %>
	  </tbody>
	</table>
</body>
</html>
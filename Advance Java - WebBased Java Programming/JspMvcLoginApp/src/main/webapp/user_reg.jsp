<%@page import="com.pragati.service.UserServiceImpl"%>
<%@page import="com.pragati.service.UserService"%>
<jsp:useBean id="user" class="com.pragati.model.User"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>

<%
	UserService userService = new UserServiceImpl();
	userService.register(user);
	response.sendRedirect("user_login_form.jsp");
%>
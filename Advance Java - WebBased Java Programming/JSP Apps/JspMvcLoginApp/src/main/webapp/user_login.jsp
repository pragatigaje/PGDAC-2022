<%@page import="com.pragati.service.UserService"%>
<%@page import="com.pragati.service.UserServiceImpl"%>
<jsp:useBean id="user" class="com.pragati.model.User" scope="session" ></jsp:useBean>
<jsp:setProperty property="*" name="user"/>

<%
	UserService userService = new UserServiceImpl();
	boolean b = userService.login(user);
	if(b){
		response.sendRedirect("user_home.jsp");
	}else{
		response.sendRedirect("user_login_form.jsp?msg=fail");
	}
%>
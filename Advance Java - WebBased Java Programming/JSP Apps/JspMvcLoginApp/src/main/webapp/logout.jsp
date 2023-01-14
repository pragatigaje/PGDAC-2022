<%
	session.removeAttribute("user");
	session.invalidate();
	response.sendRedirect("user_login_form.jsp");
%>
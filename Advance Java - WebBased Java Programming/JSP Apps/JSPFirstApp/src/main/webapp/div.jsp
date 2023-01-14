<%@page import="org.eclipse.jdt.internal.compiler.parser.ParserBasicInformation"%>
<%@page errorPage="error.jsp" %>
<%!
	int res;
	void divide (int i, int j){
		res=i/j;
	}
%>
<%
	String p1 = request.getParameter("num1");
	String p2 = request.getParameter("num2");
	
	int a = Integer.parseInt(p1);
	int b = Integer.parseInt(p2);
	divide(a,b);
%>

<%=res%>
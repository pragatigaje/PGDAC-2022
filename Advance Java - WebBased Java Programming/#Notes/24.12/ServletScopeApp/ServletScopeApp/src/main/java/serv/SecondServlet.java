package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rdata = (String)request.getAttribute("reqData");
		
		HttpSession session = request.getSession(true);
		String sdata = (String)session.getAttribute("sessionData");
		
		ServletContext sc = request.getServletContext();
		String cdata = (String)sc.getAttribute("cntxData");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>In Request Object: "+rdata+" </h1>");
		out.print("<h1>In Session Object: "+sdata+" </h1>");
		out.print("<h1>In ServletContext Object: "+cdata+" </h1>");
		out.flush();
		out.close();
	}

}

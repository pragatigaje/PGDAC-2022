package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String unm = request.getParameter("uname");
		String pass = request.getParameter("upass");
		String gen = request.getParameter("gender");
		String langs[]= request.getParameterValues("languages");
		String addr = request.getParameter("address");
		String city = request.getParameter("city");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<h2>"+unm+"</h2>");
		out.print("<h2>"+pass+"</h2>");
		out.print("<h2>"+gen+"</h2>");
		for(String s : langs) {
			out.print("<h2>"+s+"</h2>");
		}
		out.print("<h2>"+addr+"</h2>");
		out.print("<h2>"+city+"</h2>");
		out.flush();
		out.close();
		
	}

}

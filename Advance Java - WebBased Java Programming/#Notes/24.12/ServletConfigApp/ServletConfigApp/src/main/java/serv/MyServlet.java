package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig config = getServletConfig();
		String dclass = config.getInitParameter("driver_class");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(dclass);
		out.flush();
		out.close();
		
	}

}

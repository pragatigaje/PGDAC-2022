package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Electronic")
public class Electronic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String itm1 = request.getParameter("item1");
		String itm2 = request.getParameter("item2");
		if(itm1!=null) {
			Cookie c = new Cookie("fan", itm1);
			response.addCookie(c);
		}
		if(itm2!=null) {
			Cookie c = new Cookie("cooler", itm2);
			
			response.addCookie(c);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Electronic</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form action='HomeAppliances' >");
		out.print("<h2><input type='checkbox' name='item1' value='pc' >PC</h2>");
		out.print("<h2><input type='checkbox' name='item2' value='mobile' >MOBILE</h2>");
		out.print("<h2><button type='submit' >Next</button></h2>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		
	}

}

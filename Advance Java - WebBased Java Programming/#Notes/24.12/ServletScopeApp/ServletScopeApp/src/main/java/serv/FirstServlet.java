package serv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("reqData", "Data in Request Scope");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("sessionData", "Data in Session Scope"); 
		
		ServletContext sc = request.getServletContext();
		sc.setAttribute("cntxData", "Data in ServetContext Scope");
		
		
//		RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//		rd.forward(request, response);
		
		response.sendRedirect("SecondServlet"); 
		
		
	}

}

package ty.com.channing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// to configure Servlet


@WebServlet ("/validate")
public class validate_Servlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("us");
		String password = req.getParameter("ps");
		
		String custom_password = "zaid";
		if (password.equals(custom_password)) 
		{
			RequestDispatcher rd = req.getRequestDispatcher("welcome");
			rd.forward(req, resp);
		} 
		else 
		{	PrintWriter out =resp.getWriter();
		out.print("<h1> Wrong password. please enter again <h1>");
			
			RequestDispatcher rd = req.getRequestDispatcher("channing.html");
			rd.include(req, resp);
			
			
		}
		
	}
}

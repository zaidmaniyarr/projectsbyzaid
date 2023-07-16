package org.tcs.calciApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class calci extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(request.getParameter("a"));
		int n2 =  Integer.parseInt(request.getParameter("b"));
		
System.out.println("n1 :"+ n1 + "n2 :"+ n2  );
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>"+
					"<body bgcolor='red'>"+
					"<h1>Addition  : "+(n1+n2)+" <br>" +
					"Mutiplication  :  "+(n1*n2)+" <br> " +
					"Subtraction  :  "+(n1-n2)+" <br> " 
					+"</h1></body></html>");
		
		
	}
	
	

}

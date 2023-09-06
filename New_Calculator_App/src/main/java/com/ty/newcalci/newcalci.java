package com.ty.newcalci;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class newcalci  extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(request.getParameter("a"));
		int n2 =  Integer.parseInt(request.getParameter("b"));
		
			System.out.println("n1 :"+ n1 + "n2 :"+ n2  );
			
			PrintWriter out = response.getWriter();
			
//			out.print("<html>"+
//						"<body bgcolor='red'>"+
//						"<h1>Addition  : "+(n1+n2)+" <br>" +
//						"Mutiplication  :  "+(n1*n2)+" <br> " +
//						"Subtraction  :  "+(n1-n2)+" <br> " 
//						+"</h1></body></html>");
//			
			if ("Add".equals(request.getParameter("add"))) {
				out.print("<html>"+ "<body>"+"<h1> Addition of Number :"+n1+" + "+n2+" = "+(n1+n2)
						+"</h1></body></html>");
			}  else if("Sub".equals(request.getParameter("sub"))){
				out.print("<html>"+ "<body>"+"<h1> Subtraction of Number :"+n1+" - "+n2+" = "+(n1-n2)
						+"</h1></body></html>");
			}else if("Mul".equals(request.getParameter("mul"))) {
				out.print("<html>"+ "<body>"+"<h1> Multiplication of Number :"+n1+" * "+n2+" = "+(n1*n2)
						+"</h1></body></html>");
			}
	}

}

package org.ty.productApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class product extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("nm");
		String price = request.getParameter("pr");
		String qty = request.getParameter("qt");
		
		System.out.println("PID :"+ id + "PName :"+ name + "Pprice :"+ price + "Qty :" + qty   );
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>"+
					"<body bgcolor='red'>"+
					"<h1>Details of people :->"+id+""
					+name+" "+ price+" "+ qty +"</h1></body></html>");
		
		
//		JDBC code
		
		
		
		String fcqn = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306?user=root&password=root";
		String query = "insert into info.product values (?,?,?,?)";
		
		try {
			Class.forName(fcqn);
			Connection con = DriverManager.getConnection(url);
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, id);
			System.out.println(1);
			pstmt.setString(2, name);
			System.out.println(2);
			pstmt.setString(3, price);
			System.out.println(3);
			pstmt.setString(4, qty);
			System.out.println(4);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}

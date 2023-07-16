package com.ty.bookRegistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/register")
public class book_registration extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		Get Print Writer
		PrintWriter pw = response.getWriter();
		
//		set content type
		response.setContentType("text/html");
		
//		get the book info
		String bookName= request.getParameter("bookName");
		String bookEdition = request.getParameter("bookEdition");
		float bookPrice = Float.parseFloat(request.getParameter("bookPrice"));
		
		// JDBC code
		String query = "insert into book.bookdata values (?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			PreparedStatement pstmt = con.prepareStatement("query");
			
			pstmt.setString(1, bookName);
			pstmt.setString(2, bookEdition);
			pstmt.setFloat(3, bookPrice);
			
			int count = pstmt.executeUpdate();
			System.out.println(1);
			
			if (count == 1) {
				pw.println(" <h2>Record is Registered Sucessfully </h2>");
			} else {
				pw.println(" <h2>Record is Not Registered Sucessfully </h2>");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}
	
}

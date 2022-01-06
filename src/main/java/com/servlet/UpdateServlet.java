package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String email=request.getParameter("email");
        
        String psw =request.getParameter("psw");
        PrintWriter out = response.getWriter();
try {
	  Class.forName ("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:orcl","c##anjana","oracle");  

    PreparedStatement pstmt=con.prepareStatement("update registers set email =? where password=?"); 
     pstmt.setString(1,email);
     pstmt.setString(2,psw);


     pstmt.executeUpdate();  

    out.print("You are successfully update...");  
    pstmt.close();
    con.close();
    request.getRequestDispatcher ("Welcome4").include (request, response);
}
  catch (Exception e2) {System.out.println(e2);
   }  
    }
}

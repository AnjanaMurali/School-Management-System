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
import javax.servlet.http.HttpSession;

@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
        String subject = request.getParameter("subject");
		String message = request.getParameter("message");
		
		 HttpSession session = request.getSession ();
	        session.setAttribute ("email", email);
	        try
	        {
	            Class.forName ("oracle.jdbc.driver.OracleDriver");
	            Connection con = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:orcl","c##anjana","oracle");
	            PreparedStatement ps = con.prepareStatement ("insert into Queries values(?,?,?,?,?)");
	            ps.setString (1, fname);
	            ps.setString (2, lname);
	            ps.setString (3, email);
	           
	            
	            ps.setString (4, subject);
	           
	            ps.setString (5, message);

	            int i = ps.executeUpdate ();
	            if (i > 0)
	             out.print ("Your queries are being processed.Please wait!");
	            request.getRequestDispatcher ("Welcome3").include (request, response);
	        }
	        catch (Exception e2)
	        {
	            System.out.println (e2);
	        }
	        out.close ();
	    }
	}
		
	
	
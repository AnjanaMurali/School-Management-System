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

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		
		String email = request.getParameter("email");
		long mobile = Long.parseLong(request.getParameter("mobile"));
		
		String psw = request.getParameter("psw");
        HttpSession session = request.getSession ();
        session.setAttribute ("email", email);
        try
        {
            Class.forName ("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:orcl","c##anjana","oracle");
            PreparedStatement ps = con.prepareStatement ("insert into registers values(?,?,?,?,?,?)");
            ps.setString (1, fname);
            ps.setString (2, lname);
            ps.setString (3, address);
           
            ps.setString (4, email);
            ps.setLong (5, mobile);
           
            ps.setString (6, psw);

            int i = ps.executeUpdate ();
            if (i > 0)
             out.print ("You are successfully registered...");
            
            request.getRequestDispatcher ("Welcome1").include (request, response);
        }
        catch (Exception e2)
        {
            System.out.println (e2);
        }
        out.close ();
    }
}
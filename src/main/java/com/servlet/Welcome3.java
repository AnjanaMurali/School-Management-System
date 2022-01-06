package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Welcome3")
public class Welcome3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   response.setContentType ("text/html");
	        PrintWriter out = response.getWriter ();
	        String user = request.getParameter("fname");
	        out.println("<form action='ContactServlet' method='post'>");
	        out.println("</br>"+user+", Your queries are successfully submitted,we will contact you soon.Have a nive day!");
	        out.println ("</br></br>");
	        out.println("<input type='submit' value='Logout' formaction='login.html'>");
	        out.println("</form>");
	}

}

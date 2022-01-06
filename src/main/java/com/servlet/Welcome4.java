package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome4
 */
@WebServlet("/Welcome4")
public class Welcome4 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        
        out.println("<form action='RegisterServlet' method='post'>");
        out.println("</br>Updation Successfull");
        out.println ("</br></br>");
        out.println("<input type='submit' value='logout' formaction='login.html'>");
        out.println("</form>");
        }}
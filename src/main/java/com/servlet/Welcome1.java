package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
@WebServlet("/Welcome1")
public class Welcome1 extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType ("text/html");
        PrintWriter out = response.getWriter ();
        String user = request.getParameter ("fname");
        out.println("<form action='RegisterServlet' method='post'>");
        out.println("</br>Welcome  " +user);
        out.println ("</br></br>");
        out.println("<input type='submit' value='login' formaction='login.html'>");
        out.println("</form>");
    }
}
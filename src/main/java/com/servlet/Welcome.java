package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
 private static final long serialVersionUID = 1L;
 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  PrintWriter out = response.getWriter();
  out.println("<form action='LoginServlet' method='post'>");
        out.println("</br>Welcome to KenFDS!");
        out.println("</br>Recheck your details if required!<br>");
        out.println("<input type='submit' value='Update' formaction='update.html'>");
        out.println("<input type='submit' value='Logout' formaction='login.html'>");
        out.println("</form>");
 }
}

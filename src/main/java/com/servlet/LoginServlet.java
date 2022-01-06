package com.servlet;
import java.io.IOException;
import java.io.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  
  HttpSession session = request.getSession();
  String email = request.getParameter("email");
  session.setAttribute("email", email);
  // String email1=sc.getInitParameter("email");
  // sc.setAttribute("email",email);
  String password = request.getParameter("psw");
  // HttpSession session=request.getSession();
  try {
	  Class.forName ("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:orcl","c##anjana","oracle");
   PreparedStatement pst = con.prepareStatement("Select email,password from registers where email=? and password=?");
   pst.setString(1, email);
   pst.setString(2, password);
   ResultSet rs = pst.executeQuery();
   if (rs.next()) {
    out.print("You are successfully loggedin...");
    request.getRequestDispatcher("Welcome").include(request, response);
   } else {
    out.println("Username or Password incorrect");
    request.getRequestDispatcher("login.html").include(request, response);
   }
  } catch (ClassNotFoundException | SQLException e) {
   e.printStackTrace();
  }
 }
}
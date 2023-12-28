package com.healthcare.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healthcare.entity.Login;
import com.healthcare.service.LoginService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw =response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Login login = new Login();
		login.setEmail(email);
		login.setPassword(password);
		
		RequestDispatcher rd1=request.getRequestDispatcher("adminHome.jsp");
		RequestDispatcher rd2=request.getRequestDispatcher("login.jsp");
		LoginService ls=new LoginService();
		String result =ls.signIn(login);
		if(result.equalsIgnoreCase("Successfully Login")) {		
			rd1.forward(request, response);
		}else {
			pw.println("Failure try once again");
			rd2.forward(request, response);
		}
		response.setContentType("html/text");
		
	}

}

package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		// we can check emailid and password hard-coding or using jdbc. 
		if(emailid.equals("admin@gmail.com") && password.equals("admin@123")) {
			pw.println("succesfully login with get method ");
		}else {
			pw.println("failure try once again with get method");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		// we can check emailid and password hard-coding or using jdbc. 
		if(emailid.equals("admin@gmail.com") && password.equals("admin@123")) {
			pw.println("succesfully login with post method");
		}else {
			pw.println("failure try once again with post method");
		}
	}

}
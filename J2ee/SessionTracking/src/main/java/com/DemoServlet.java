package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    int count=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession hs = request.getSession();
		pw.println("<br/> Count value is "+count);
		pw.println("<br/> Session Id is "+hs.getId());
		if(hs.isNew()) {
			pw.println("<br/> New Client");
		}else {
			pw.println("<br/> Old Client");
		}
		pw.println("<br/> Session Creation time millisecond format "+hs.getCreationTime());
		pw.println("<br/> Session Creation time Date format "+new Date(hs.getCreationTime()));
		pw.println("<br/> Last Access time  "+new Date(hs.getLastAccessedTime()));
		pw.println("<br/>Session default time is  "+hs.getMaxInactiveInterval());
		hs.setMaxInactiveInterval(600);
		pw.println("<br/>Session default time is  "+hs.getMaxInactiveInterval());
		if(count%5==0) {
			hs.invalidate();
			pw.println("<br/> Now Session Destroy ");
		}
		count++;
		//RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		//rd.include(request, response);
		//response.sendRedirect("index.jsp");
		//response.setContentType("text/html");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

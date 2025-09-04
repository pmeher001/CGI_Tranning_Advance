package com.pms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pms.bean.Product;
import com.pms.service.ProductService;

/**
 * Servlet implementation class ProductUpdateController
 */
@WebServlet("/ProductUpdateController")
public class ProductUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductUpdateController() {
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
		PrintWriter pw = response.getWriter();
		int pid = Integer.parseInt(request.getParameter("pid"));
		float price = Float.parseFloat(request.getParameter("price"));
		
		ProductService ps = new ProductService();
		
		Product p = new Product();
		p.setPid(pid);
		p.setPrice(price);
		
		String result = ps.updateProduct(p);
		pw.print(result);
		RequestDispatcher rs = request.getRequestDispatcher("updateProduct.jsp");
		rs.include(request, response);
		response.setContentType("text/html");
	}

}

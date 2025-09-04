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
 * Servlet implementation class ProductStoreController
 */
@WebServlet("/ProductStoreController")
public class ProductStoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductStoreController() {
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
		
		// take the value through forms, as well as doing type casting 
		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		float price = Float.parseFloat(request.getParameter("price"));
		
		// convert these values to object. 
		Product p = new Product();
		p.setPid(pid);
		p.setPname(pname);
		p.setPrice(price);
		
		// create service class object and pass the value to service layer 
		// base upon condition re-direct to another view page. 
		ProductService ps = new ProductService();
		String result = ps.storeProduct(p);
		pw.print(result);
		
		RequestDispatcher rd = request.getRequestDispatcher("addProduct.jsp");
		rd.include(request, response);
		response.setContentType("text/html");
		
		
	}

}

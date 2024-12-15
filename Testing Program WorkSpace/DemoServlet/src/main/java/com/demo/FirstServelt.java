package com.demo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Enumeration;

import javax.xml.ws.spi.http.HttpContext;

/**
 * Servlet implementation class FirstServelt
 */
public class FirstServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("DoGet Method Calling");
		
		
		System.out.println(getServletInfo()+"Info");
		
		// Servlet Config
//		ServletConfig config = getServletConfig();
//		config.getInitParameter("name");
//		Enumeration<String> a = config.getInitParameterNames();
		
		
		HttpSession session=request.getSession();
		session.setAttribute("userName", "Ananth");
		System.out.println("Before Check Session"+session.getAttribute("userName"));
		
		session.invalidate();
		
		System.out.println("After Check Session"+session.getAttribute("userName"));

		RequestDispatcher dis = request.getRequestDispatcher("Login.jsp");
		dis.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("DoPost Method Calling");
	}
	

}

package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.model.Participant;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		
		// Store Value in Local Veriable
		String name = request.getParameter("name");
        String email = request.getParameter("email");
        String institute = request.getParameter("institute");
        String gender = request.getParameter("gender");
        String[] events = request.getParameterValues("events");
        String comments = request.getParameter("comments");

        // Validate input
        if (name.isEmpty() || email.isEmpty() || institute.isEmpty() || events == null) {
            request.setAttribute("error", "Please fill all required fields and select at least one event.");
            request.getRequestDispatcher("Regsiter.jsp").forward(request, response);
            return;
        }

        String eventsList = String.join(", ", events);
        System.out.println(eventsList);
        Participant participant = new Participant(name, email, institute, gender, eventsList, comments);

        // Store the participant object in request scope and redirect to success page
        request.setAttribute("participant", participant);
        RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
        dispatcher.forward(request, response);
	}

}

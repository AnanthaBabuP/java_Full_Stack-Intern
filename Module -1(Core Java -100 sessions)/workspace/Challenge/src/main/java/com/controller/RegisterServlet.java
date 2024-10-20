package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.dao.ParticipantsDAO;
import com.model.Participant;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ParticipantsDAO dao;
       
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
		response.setContentType("text/html");
		// Get form values via parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String institute = request.getParameter("institute");
        String gender = request.getParameter("gender");
        String event = request.getParameter("event");
        String comments = request.getParameter("comments");
        String agree = request.getParameter("agree");
        
        
        // Create an Event object
        Participant member = new Participant();
        member.setName(name);
        member.setEmail(email);
        member.setInstitute(institute);
        member.setGender(gender);
        member.setComments(comments);
        if(event == null) {
        	member.setEvent("");
        } else {
        	 member.setEvent(event);
        }
        
        if(agree == null) {
        	member.setAgree("");
        } else {
        	member.setAgree(agree);
        }
        
        
        List<Participant> memberArray = new ArrayList<>();
        memberArray.add(member);
        StringBuilder sb = new StringBuilder("");
        
        request.setAttribute("participants", memberArray);
        // Check All Fields In Validate
        if(name.isEmpty()) {
        	sb.append("Please Enter Name");
        } else if(email.isEmpty()){
        	sb.append("Please Enter Email");
        } else if(institute.isEmpty()) {
        	sb.append("Please Enter Institute");
        } else if(gender.isEmpty()) {
        	sb.append("Please Select Gender");
        } else if(event.equals("")) {
        	sb.append("Please Select Event");
        } else if(agree == null) {
        	sb.append("Agree All Points");
        }
        
        // Check ErrorMessgae
        if(!sb.toString().equals("")) {
        	request.setAttribute("error", sb.toString());
            request.getRequestDispatcher("ErrRegister.jsp").forward(request, response);
        	return;
        }
        	
        // Save event using DAO
        dao = new ParticipantsDAO();
        boolean isAdded = dao.addParticipants(member);

        if (isAdded) {
            request.setAttribute("message", "Event registered successfully!");
            request.getRequestDispatcher("Success.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Error occurred. Try again.");
            request.getRequestDispatcher("Register.jsp").forward(request, response);
        }
	}

}

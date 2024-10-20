package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.dao.StudentDAO;
import com.model.Student;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	
	StudentDAO dao;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher dispatcher ;
		try {
			System.out.println("Welcome to Update Controller File");
			
			int regNo = Integer.parseInt(request.getParameter("hiddenRegNo"));
			String name= request.getParameter("txtName");
			int age = Integer.parseInt(request.getParameter("txtAge"));
			String gender = request.getParameter("rdoGender");
			String dept = request.getParameter("department");
			
			SimpleDateFormat smf = new SimpleDateFormat("dd-MM-yyyy");
			Date dob = smf.parse(request.getParameter("txtDOB"));
			
			// Create Object 
			Student s = new Student();
			
			// set Value
			s.setRegno(regNo);
			s.setStudent_name(name);
			s.setAge(age);
			s.setDept(dept);
			s.setGender(gender);
			s.setDob(dob);
			
			dao = new StudentDAO();
			int count = dao.updateStudent(s);
			if(count !=0) {
				out.println("<h1 style=color:green;>"+count+" Record Inserted Updated...</h1>");

				dao = new StudentDAO();
				ArrayList<Student> studentList = dao.getAllStudentDetails();
				request.setAttribute("students", studentList);
				
				dispatcher = request.getRequestDispatcher("ViewAllStudents.jsp");
				dispatcher.include(request, response);
			} else {
				out.println("<h1 style=color:red;> Record Update Failled...</h1>");

				dao = new StudentDAO();
				ArrayList<Student> studentList = dao.getAllStudentDetails();
				request.setAttribute("students", studentList);
				
				dispatcher = request.getRequestDispatcher("ViewAllStudents.jsp");
				dispatcher.include(request, response);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

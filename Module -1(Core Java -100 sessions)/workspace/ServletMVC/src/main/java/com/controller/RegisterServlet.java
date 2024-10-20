package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.dao.StudentDAO;
import com.model.Student;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	StudentDAO dao;
	
	RequestDispatcher dispatcher;

       
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
		String method = request.getParameter("action");
		PrintWriter out = response.getWriter();
		if(method.equals("show")) {
			dao = new StudentDAO();
			ArrayList<Student> studentList = dao.getAllStudentDetails();
//			studentList.forEach(t -> System.out.println(t.getRegno()));
			request.setAttribute("students", studentList);
			
			dispatcher = request.getRequestDispatcher("ViewAllStudents.jsp");
			dispatcher.forward(request, response);
		} else if(method.equals("edit")) {
			int regno = Integer.parseInt(request.getParameter("regno"));
			ArrayList<Student> studentListByRegno =  dao.getStudentByRegno(regno);
			request.setAttribute("StudentListByRegno", studentListByRegno);
			
			dispatcher = request.getRequestDispatcher("UpdateStudent.jsp");
			dispatcher.include(request, response);
		
		} else if(method.equals("delete")) {
			int regno = Integer.parseInt(request.getParameter("regno"));
			
			
			dao = new StudentDAO();
			int count = dao.deleteStudent(regno);
			
			ArrayList<Student> studentListByRegno =  dao.getStudentByRegno(regno);
			request.setAttribute("StudentListByRegno", studentListByRegno);
			if(count !=0) {
				dao = new StudentDAO();
				ArrayList<Student> studentList = dao.getAllStudentDetails();
				request.setAttribute("students", studentList);
				
				out.println("<h1 style=color:green;>"+count+" Record Deleted SuccessFully...</h1>");
				dispatcher = request.getRequestDispatcher("ViewAllStudents.jsp");
				dispatcher.include(request, response);
			} else {
				dao = new StudentDAO();
				ArrayList<Student> studentList = dao.getAllStudentDetails();
				request.setAttribute("students", studentList);
				
				out.println("<h1 style=color:red;> Record Delete Failled...</h1>");
				dispatcher = request.getRequestDispatcher("ViewAllStudents.jsp");
				dispatcher.include(request, response);
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			int regNo = Integer.parseInt(request.getParameter("txtRegno"));
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
			/**
				System.out.println(regNo);
				System.out.println(name);
				System.out.println(age);
				System.out.println(gender);
				System.out.println(dept);
				System.out.println(dob);
			*/
			
			dao = new StudentDAO();
			int count = dao.addStudent(s);
			if(count !=0) {
				
				out.println("<h1 style=color:green;>"+count+" Record Inserted successfully...</h1>");
				dispatcher = request.getRequestDispatcher("StudentRegisteration.jsp");
				dispatcher.include(request, response);
			} else {
				out.println("<h1 style=color:red;> Record Inserted Failled...</h1>");
				dispatcher = request.getRequestDispatcher("StudentRegisteration.jsp");
				dispatcher.include(request, response);
			}
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

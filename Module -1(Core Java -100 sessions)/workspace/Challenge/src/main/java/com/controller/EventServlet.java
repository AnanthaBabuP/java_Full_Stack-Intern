package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.dao.EventDAO;
import com.model.Event;

/**
 * Servlet implementation class EventServlet
 */
public class EventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EventDAO eventDAO; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equals("show")) {
			try {
				listEvents(request, response);
			} catch (ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			switch (action) {
	            case "add":
	                addEvent(request, response);
	                break;
	            case "edit":
	            	editEvent(request, response);
	                break;
	            case "update":
	            	updateEvent(request, response);
	            	break;
	            case "delete":
	                deleteEvent(request, response);
	                break;
	            default:
	                listEvents(request, response);
	                break;
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    
    private void addEvent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String eventName = request.getParameter("eventName");
        String instituteName = request.getParameter("instituteName");
        String eventCategory = request.getParameter("eventCategory");
        int studentAge = Integer.parseInt(request.getParameter("studentAge"));
        String studentQualification = request.getParameter("studentQualification");

        Event event = new Event();
        event.setEventName(eventName);
        event.setInstituteName(instituteName);
        event.setEventCategory(eventCategory);
        event.setStudentAge(studentAge);
        event.setStudentQualification(studentQualification);

        try {
        	eventDAO = new EventDAO();
            eventDAO.saveEvent(event);
            request.setAttribute("message", "Event added successfully!");
        } catch (Exception e) {
            request.setAttribute("error", "Error adding event: " + e.getMessage());
        }
        listEvents(request, response);
    }

    private void editEvent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        int eventId = Integer.parseInt(request.getParameter("id"));
        eventDAO = new EventDAO();
        Event event = eventDAO.getEventById(eventId);
        request.setAttribute("event", event);
        request.getRequestDispatcher("EditEvent.jsp").forward(request, response);
    }

    private void updateEvent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        int eventId = Integer.parseInt(request.getParameter("id"));
        String eventName = request.getParameter("eventName");
        String instituteName = request.getParameter("instituteName");
        String eventCategory = request.getParameter("eventCategory");
        int studentAge = Integer.parseInt(request.getParameter("studentAge"));
        String studentQualification = request.getParameter("studentQualification");

        Event event = new Event();
        event.setId(eventId);
        event.setEventName(eventName);
        event.setInstituteName(instituteName);
        event.setEventCategory(eventCategory);
        event.setStudentAge(studentAge);
        event.setStudentQualification(studentQualification);

        try {
        	eventDAO = new EventDAO();
            eventDAO.updateEvent(event);
            request.setAttribute("message", "Event updated successfully!");
        } catch (Exception e) {
            request.setAttribute("error", "Error updating event: " + e.getMessage());
        }
        listEvents(request, response);
    }

    private void deleteEvent(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        int eventId = Integer.parseInt(request.getParameter("id"));
        try {
        	eventDAO = new EventDAO();
            eventDAO.deleteEvent(eventId);
            request.setAttribute("message", "Event deleted successfully!");
        } catch (Exception e) {
            request.setAttribute("error", "Error deleting event: " + e.getMessage());
        }
        listEvents(request, response);
    }

    private void listEvents(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
    	eventDAO = new EventDAO();
        List<Event> events = eventDAO.getAllEvents();
        request.setAttribute("events", events);
        request.getRequestDispatcher("Events.jsp").forward(request, response);
    }

}

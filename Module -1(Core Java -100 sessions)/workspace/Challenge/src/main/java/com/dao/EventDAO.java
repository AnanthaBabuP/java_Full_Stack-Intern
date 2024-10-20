package com.dao;

import com.dbutil.DBConnection;
import com.model.Event;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EventDAO {
    
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	Connection dbCon;

    public EventDAO() {
    	dbCon = DBConnection.getConnection();
	}
    
    public void saveEvent(Event event) throws SQLException {
        String query = "INSERT INTO events (eventName, instituteName, eventCategory, studentAge, studentQualification) VALUES (?, ?, ?, ?, ?)";
        ps = dbCon.prepareStatement(query);
        ps.setString(1, event.getEventName());
        ps.setString(2, event.getInstituteName());
        ps.setString(3, event.getEventCategory());
        ps.setInt(4, event.getStudentAge());
        ps.setString(5, event.getStudentQualification());
        ps.executeUpdate();
    }

    public List<Event> getAllEvents() throws SQLException {
    	List<Event> events = new ArrayList<>();
        String query = "SELECT * FROM events";
	    stmt = dbCon.createStatement();
	    rs = stmt.executeQuery(query);
        while (rs.next()) {
            Event event = new Event();
            event.setId(rs.getInt("id"));
            event.setEventName(rs.getString("eventName"));
            event.setInstituteName(rs.getString("instituteName"));
            event.setEventCategory(rs.getString("eventCategory"));
            event.setStudentAge(rs.getInt("studentAge"));
            event.setStudentQualification(rs.getString("studentQualification"));
            events.add(event);
        }
        return events;
    }

    public Event getEventById(int id) throws SQLException {
        Event event = null;
        String query = "SELECT * FROM events WHERE id=?";
        ps = dbCon.prepareStatement(query);
        ps.setInt(1, id);
        rs = ps.executeQuery();
        if (rs.next()) {
            event = new Event();
            event.setId(rs.getInt("id"));
            event.setEventName(rs.getString("eventName"));
            event.setInstituteName(rs.getString("instituteName"));
            event.setEventCategory(rs.getString("eventCategory"));
            event.setStudentAge(rs.getInt("studentAge"));
            event.setStudentQualification(rs.getString("studentQualification"));
        }
        return event;
    }

    public void updateEvent(Event event) throws SQLException {
        String query = "UPDATE events SET eventName=?, instituteName=?, eventCategory=?, studentAge=?, studentQualification=? WHERE id=?";
        ps = dbCon.prepareStatement(query);
        ps.setString(1, event.getEventName());
        ps.setString(2, event.getInstituteName());
        ps.setString(3, event.getEventCategory());
        ps.setInt(4, event.getStudentAge());
        ps.setString(5, event.getStudentQualification());
        ps.setInt(6, event.getId());
        ps.executeUpdate();
    }

    public void deleteEvent(int id) throws SQLException {
        String query = "DELETE FROM events WHERE id=?";
        try {
            ps = dbCon.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
			e.printStackTrace();
		}
    }
}

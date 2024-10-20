package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dbutil.DBConnection;
import com.model.Participant;

public class ParticipantsDAO {
	
	public boolean addParticipants(Participant members) {
        String query = "INSERT INTO eventparticipentsDetails (name, email, institute, gender, event_category, comments) VALUES (?, ?, ?, ?, ?, ?)";
        try {
        	Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query);

             ps.setString(1, members.getName());
             ps.setString(2, members.getEmail());
             ps.setString(3, members.getInstitute());
             ps.setString(4, members.getGender());
             ps.setString(5, members.getEvent());
             ps.setString(6, members.getComments());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
	}
}

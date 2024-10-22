package com.text;

import com.dao.TeamDAO;
import com.model.Captain;
import com.model.Team;

public class TeamMain {

	public static void main(String[] args) {
		Team team = new Team();
		
		team.setTeam_logo("Chakra");
		team.setTeam_size(11);
		team.setTeam_type("Cricket");
		
		Captain capt = new Captain();
		capt.setCapt_name("Rohit sharma");
		capt.setCapt_age(35);
		capt.setCapt_place("Goa");
		
		team.setCaptain(capt);
		
		capt.setTeam(team);
		
		TeamDAO dao = new TeamDAO();
		dao.save(team);
		

	}

}

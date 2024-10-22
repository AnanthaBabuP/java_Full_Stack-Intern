package com.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "team")
public class Team implements Serializable{
	@Id
	@GenericGenerator(name = "ref", strategy = "increment" )
	@GeneratedValue (generator = "ref")
	private int team_id;
	
	private String team_logo;
	private int team_size;
	private String team_type;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Captain captain;
	
	
	public Captain getCaptain() {
		return captain;
	}
	
	public void setCaptain(Captain captain) {
		this.captain = captain;
	}

	public Team() {
		// TODO Auto-generated constructor stub
	}

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public String getTeam_logo() {
		return team_logo;
	}

	public void setTeam_logo(String team_logo) {
		this.team_logo = team_logo;
	}

	public int getTeam_size() {
		return team_size;
	}

	public void setTeam_size(int team_size) {
		this.team_size = team_size;
	}

	public String getTeam_type() {
		return team_type;
	}

	public void setTeam_type(String team_type) {
		this.team_type = team_type;
	}

	
}

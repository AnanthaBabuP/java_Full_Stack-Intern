package com.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "captain")
public class Captain implements Serializable{

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Id
	@GenericGenerator(name = "ref", strategy = "increment" )
	@GeneratedValue (generator = "ref")
	private int capt_id;
	
	private String capt_name;
	private int capt_age;
	private String capt_place;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "team")
	private Team team; // team Object
	
	public int getCapt_id() {
		return capt_id;
	}

	public void setCapt_id(int capt_id) {
		this.capt_id = capt_id;
	}

	public String getCapt_name() {
		return capt_name;
	}

	public void setCapt_name(String capt_name) {
		this.capt_name = capt_name;
	}

	public int getCapt_age() {
		return capt_age;
	}

	public void setCapt_age(int capt_age) {
		this.capt_age = capt_age;
	}

	public String getCapt_place() {
		return capt_place;
	}

	public void setCapt_place(String capt_place) {
		this.capt_place = capt_place;
	}

	public Captain() {
		// TODO Auto-generated constructor stub
	}

}
